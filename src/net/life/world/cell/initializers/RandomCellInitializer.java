package net.life.world.cell.initializers;

import java.util.Random;

import net.life.world.cell.CellInitializer;
import net.life.world.cell.CellState;

public class RandomCellInitializer extends CellInitializer {
	
	private static final Random RANDOM = new Random();
	
	@Override
	public CellState getState(int x, int y) {
		CellState[] states = CellState.values();
		
		int length = states.length;
		
		int index = RANDOM.nextInt(length);
		
		return states[index];
	}
	
}
