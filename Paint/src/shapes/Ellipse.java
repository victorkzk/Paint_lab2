package shapes;

import shapesDrawers.Drawer;
import shapesDrawers.EllipseDrawer;

public class Ellipse extends Shape implements Observer {
	
	protected int width, height;
	protected boolean isCircle;
	
	public Ellipse(boolean isCircle) {
		this.isCircle = isCircle; 
	}

	public void updateWidth(int width) {
		this.width = width;
		if (isCircle)
			this.height = width;
	}
	
	public void updateHeight(int height) {
		if (!isCircle)
			this.height = height;
	}
	
	public Drawer getDrawer() {
		return new EllipseDrawer();
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public boolean isCircle() {
		return isCircle;
	}
}
