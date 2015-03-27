package painters;

import javafx.scene.canvas.GraphicsContext;
import shapes.Ellipse;
import shapes.Shape;

public class EllipsePainter implements IDrawer{
	
	private Ellipse ellipse;
	
	public EllipsePainter(Shape shape) {
		ellipse = (Ellipse)shape;
	}
	
	public void draw(GraphicsContext gc) {
		gc.fillOval(ellipse.getX(), ellipse.getY(), ellipse.getWidth(), ellipse.getHeight());
	}
}
