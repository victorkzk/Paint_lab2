package painters;

import javafx.scene.canvas.GraphicsContext;
import shapes.Rectangle;
import shapes.Shape;

public class RectanglePainter implements IDrawer{
	
	private Rectangle rectangle;
	
	public RectanglePainter(Shape shape) {
		rectangle = (Rectangle)shape;
	}
	
	public void draw(GraphicsContext gc) {
		gc.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
		
	}
}
