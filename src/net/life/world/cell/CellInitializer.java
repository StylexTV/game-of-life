package net.life.world.cell;

import net.life.world.cell.initializers.PatternCellInitializer;
import net.life.world.cell.initializers.RandomCellInitializer;

public abstract class CellInitializer {
	
	public static final CellInitializer GLIDER_PATTERN = new PatternCellInitializer(CellPattern.GLIDER);
	
	public static final CellInitializer RANDOM = new RandomCellInitializer();
	
	public abstract CellState getState(int x, int y);
	
}
