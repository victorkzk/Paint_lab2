package shapesDrawers;

import javafx.scene.canvas.GraphicsContext;
import shapes.Shape;

public interface Drawer {
	
	public void draw(Shape shape, GraphicsContext gc);
	
}
