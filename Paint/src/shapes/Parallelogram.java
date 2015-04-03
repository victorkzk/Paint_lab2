package shapes;

import shapesDrawers.Drawer;
import shapesDrawers.ParallelogramDrawer;

public class Parallelogram extends Shape implements Observer{
	
	protected int width, height;
	private boolean isRhombus;
	
	public Parallelogram(boolean isRhombus) {
		this.isRhombus = isRhombus;
	}

	public Drawer getDrawer() {
		return new ParallelogramDrawer();
	}
	
	public void updateWidth(int width) {
		this.width = width;
		if (isRhombus)
			this.height = width;
	}
	
	public void updateHeight(int height) {
		this.height = height;
		if (!isRhombus)
			this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public boolean isRhombus() {
		return isRhombus;
	}
}
