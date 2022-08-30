package net.life.world.cell.neighbourhoods;

public class MooreCellNeighbourhood extends VonNeumannCellNeighbourhood {
	
	public MooreCellNeighbourhood() {
		addNeighbourOffset(-1, -1);
		addNeighbourOffset( 1, -1);
		addNeighbourOffset(-1,  1);
		addNeighbourOffset( 1,  1);
	}
	
}
