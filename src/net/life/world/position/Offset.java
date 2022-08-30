package net.life.world.position;

public class Offset {
	
	private int deltaX;
	private int deltaY;
	
	public Offset(int dx, int dy) {
		this.deltaX = dx;
		this.deltaY = dy;
	}
	
	public int getDeltaX() {
		return deltaX;
	}
	
	public int getDeltaY() {
		return deltaY;
	}
	
}
