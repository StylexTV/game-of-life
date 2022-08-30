package net.life.world.cell;

import java.awt.image.BufferedImage;

public class CellMap {
	
	private int width;
	private int height;
	
	private CellState defaultState;
	
	private CellState[][] states;
	
	public CellMap(int width, int height) {
		this(width, height, CellState.DEAD);
	}
	
	public CellMap(int width, int height, CellState defaultState) {
		this.width = width;
		this.height = height;
		this.defaultState = defaultState;
		
		this.states = new CellState[width][height];
	}
	
	public BufferedImage toImage() {
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				
				CellState state = getState(x, y);
				
				int color = state.getColor();
				
				image.setRGB(x, y, color);
			}
		}
		
		return image;
	}
	
	public void initialize(CellInitializer initializer) {
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				
				CellState state = initializer.getState(x, y);
				
				setState(x, y, state);
			}
		}
	}
	
	public boolean equals(CellMap map) {
		if(map.getWidth() != width || map.getHeight() != height) return false;
		
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				
				CellState state = map.getState(x, y);
				
				if(state != getState(x, y)) return false;
			}
		}
		
		return true;
	}
	
	public CellState getState(int x, int y) {
		if(isOutsideBounds(x, y)) return defaultState;
		
		CellState state = states[x][y];
		
		return state == null ? defaultState : state;
	}
	
	public void setState(int x, int y, CellState state) {
		if(isOutsideBounds(x, y)) return;
		
		states[x][y] = state;
	}
	
	private boolean isOutsideBounds(int x, int y) {
		return x < 0 || y < 0 || x >= width || y >= height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public CellState getDefaultState() {
		return defaultState;
	}
	
	public CellState[][] getStates() {
		return states;
	}
	
}
