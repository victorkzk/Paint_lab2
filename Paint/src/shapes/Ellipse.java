package shapes;

public class Ellipse extends Shape {
	
	protected int width, height;
	
	public Ellipse(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Ellipse(int x, int y, int width) {
		super(x, y);
		this.width = width;
		this.height = width;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}