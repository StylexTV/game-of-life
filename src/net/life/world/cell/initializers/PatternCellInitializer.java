package net.life.world.cell.initializers;

import net.life.world.cell.CellInitializer;
import net.life.world.cell.CellPattern;
import net.life.world.cell.CellState;

public class PatternCellInitializer extends CellInitializer {
	
	private CellPattern pattern;
	
	public PatternCellInitializer(CellPattern pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public CellState getState(int x, int y) {
		return pattern.getState(x, y);
	}
	
	public CellPattern getPattern() {
		return pattern;
	}
	
}
