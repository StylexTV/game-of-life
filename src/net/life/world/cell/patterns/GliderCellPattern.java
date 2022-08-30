package net.life.world.cell.patterns;

import net.life.world.cell.CellPattern;
import net.life.world.cell.CellState;

public class GliderCellPattern extends CellPattern {
	
	public GliderCellPattern() {
		super(3, 3);
		
		setState(1, 0, CellState.ALIVE);
		setState(2, 1, CellState.ALIVE);
		setState(2, 2, CellState.ALIVE);
		setState(1, 2, CellState.ALIVE);
		setState(0, 2, CellState.ALIVE);
	}
	
}
