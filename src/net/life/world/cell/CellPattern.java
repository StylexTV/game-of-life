package net.life.world.cell;

import net.life.world.cell.patterns.GliderCellPattern;

public class CellPattern extends CellMap {
	
	public static final CellPattern GLIDER = new GliderCellPattern();
	
	public CellPattern(int width, int height) {
		super(width, height);
	}
	
}
