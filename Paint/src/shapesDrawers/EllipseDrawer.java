package shapesDrawers;

import javafx.scene.canvas.GraphicsContext;
import shapes.Ellipse;
import shapes.Shape;

public class EllipseDrawer implements Drawer{
	
	public void draw(Shape shape, GraphicsContext gc) {
		Ellipse ellipse = (Ellipse)shape;
		gc.fillOval(ellipse.getX(), ellipse.getY(), ellipse.getWidth(), ellipse.getHeight());
		gc.strokeOval(ellipse.getX(), ellipse.getY(), ellipse.getWidth(), ellipse.getHeight());
	}
}
