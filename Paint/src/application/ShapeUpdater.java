package application;

import shapes.Ellipse;
import shapes.Observer;
import shapes.Parallelogram;
import shapes.Rectangle;

public class ShapeUpdater implements Observer {
	
	private Ellipse ellipse = new Ellipse(false);
	private Ellipse circle = new Ellipse(true);
	private Parallelogram parallelogram = new Parallelogram(false);
	private Parallelogram rhombus = new Parallelogram(true);
	private Rectangle rectangle = new Rectangle(false);
	private Rectangle square = new Rectangle(true);
	
	public void updateWidth(int width) {
		ellipse.updateWidth(width);
		circle.updateWidth(width);
		parallelogram.updateWidth(width);
		rhombus.updateWidth(width);
		rectangle.updateWidth(width);
		square.updateWidth(width);
	}
	
	public void updateHeight(int height) {
		ellipse.updateHeight(height);
		parallelogram.updateHeight(height);
		rectangle.updateHeight(height);
	}
	
	public Ellipse getEllipse() {
		return ellipse;
	}
	
	public Ellipse getCircle() {
		return circle;
	}
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	
	public Rectangle getSquare() {
		return square;
	}
	
	public Parallelogram getParallelogram() {
		return parallelogram;
	}
	
	public Parallelogram getRhombus() {
		return rhombus;
	}
}