package net.life.world.cell;

public abstract class CellProcessor {
	
	public static final CellProcessor DEFAULT = new CellProcessor() {
		
		@Override
		public CellState process(int x, int y, CellState state, CellMap cells) {
			int amount = CellNeighbourhood.MOORE.countNeighbours(x, y, cells);
			
			if(state == CellState.DEAD) return amount == 3 ? CellState.ALIVE : state;
			
			if(amount < 2 || amount > 3) return CellState.DEAD;
			
			return state;
		}
	};
	
	public abstract CellState process(int x, int y, CellState state, CellMap cells);
	
	public CellState process(int x, int y, CellMap cells) {
		CellState state = cells.getState(x, y);
		
		return process(x, y, state, cells);
	}
	
}
