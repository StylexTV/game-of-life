package net.life.world.cell;

import java.util.ArrayList;
import java.util.List;

import net.life.world.cell.neighbourhoods.MooreCellNeighbourhood;
import net.life.world.cell.neighbourhoods.VonNeumannCellNeighbourhood;
import net.life.world.position.Offset;

public class CellNeighbourhood {
	
	public static final CellNeighbourhood MOORE = new MooreCellNeighbourhood();
	public static final CellNeighbourhood VON_NEUMANN = new VonNeumannCellNeighbourhood();
	
	private List<Offset> neighbourOffsets = new ArrayList<>();
	
	public void addNeighbourOffset(int dx, int dy) {
		Offset offset = new Offset(dx, dy);
		
		neighbourOffsets.add(offset);
	}
	
	public CellState getNeighbourState(int x, int y, int index, CellMap cells) {
		Offset offset = neighbourOffsets.get(index);
		
		x += offset.getDeltaX();
		y += offset.getDeltaY();
		
		return cells.getState(x, y);
	}
	
	public int countNeighbours(int x, int y, CellMap cells) {
		int amount = 0;
		
		for(int i = 0; i < getSize(); i++) {
			
			CellState state = getNeighbourState(x, y, i, cells);
			
			if(state == CellState.ALIVE) amount++;
		}
		
		return amount;
	}
	
	public int getSize() {
		return neighbourOffsets.size();
	}
	
}
