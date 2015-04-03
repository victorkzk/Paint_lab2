package shapesDrawers;

import javafx.scene.canvas.GraphicsContext;
import shapes.Rectangle;
import shapes.Shape;

public class RectangleDrawer implements Drawer{
	
	public void draw(Shape shape, GraphicsContext gc) {
		Rectangle rectangle = (Rectangle)shape;
		gc.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
		gc.strokeRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
	}
}
