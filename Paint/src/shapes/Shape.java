package shapes;

import shapesDrawers.Drawer;

abstract public class Shape{
	protected int x, y;

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract Drawer getDrawer();
}
