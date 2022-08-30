package net.life.world;

import java.awt.image.BufferedImage;

import net.life.world.cell.CellInitializer;
import net.life.world.cell.CellMap;
import net.life.world.cell.CellProcessor;
import net.life.world.cell.CellState;

public class World {
	
	private CellMap cells;
	private CellMap previousCells;
	
	public World(int size) {
		this(size, size);
	}
	
	public World(int width, int height) {
		this.cells = new CellMap(width, height);
		this.previousCells = new CellMap(width, height);
	}
	
	public BufferedImage toImage() {
		return cells.toImage();
	}
	
	public void initialize(CellInitializer initializer) {
		cells.initialize(initializer);
	}
	
	public void stabilize(CellProcessor processor) {
		while(!isStable()) update(processor);
	}
	
	public void update(CellProcessor processor, int amount) {
		for(int i = 0; i < amount; i++) update(processor);
	}
	
	public void update(CellProcessor processor) {
		for(int x = 0; x < getWidth(); x++) {
			for(int y = 0; y < getWidth(); y++) {
				
				CellState state = processor.process(x, y, cells);
				
				previousCells.setState(x, y, state);
			}
		}
		
		CellMap map = cells;
		
		cells = previousCells;
		previousCells = map;
	}
	
	public boolean isStable() {
		return cells.equals(previousCells);
	}
	
	public int getWidth() {
		return cells.getWidth();
	}
	
	public int getHeight() {
		return cells.getHeight();
	}
	
}
