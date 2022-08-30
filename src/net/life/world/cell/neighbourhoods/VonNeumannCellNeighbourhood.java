package net.life.world.cell.neighbourhoods;

import net.life.world.cell.CellNeighbourhood;

public class VonNeumannCellNeighbourhood extends CellNeighbourhood {
	
	public VonNeumannCellNeighbourhood() {
		addNeighbourOffset(-1,  0);
		addNeighbourOffset( 1,  0);
		addNeighbourOffset( 0, -1);
		addNeighbourOffset( 0,  1);
	}
	
}
