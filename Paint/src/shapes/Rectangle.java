package shapes;

import shapesDrawers.Drawer;
import shapesDrawers.RectangleDrawer;

public class Rectangle extends Parallelogram {
	
	private boolean isSquare;
	
	public Rectangle(boolean isSquare) {
		super(false);
		this.isSquare = isSquare;
	}
	
	@Override
	public void updateWidth(int width) {
		this.width = width;
		if (isSquare)
			this.height = width;
	}
	
	@Override
	public void updateHeight(int height) {
		this.height = height;
		if (!isSquare)
			this.height = height;
	}
	
	public boolean isSquare() {
		return isSquare;
	}

	@Override
	public Drawer getDrawer() {
		return new RectangleDrawer();
	}
}
