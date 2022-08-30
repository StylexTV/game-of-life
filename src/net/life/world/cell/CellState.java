package net.life.world.cell;

public enum CellState {
	
	ALIVE(0xFFFFFF), DEAD(0x000000);
	
	private int color;
	
	private CellState(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
}
