package painters;

import javafx.scene.canvas.GraphicsContext;
import shapes.Parallelogram;
import shapes.Rectangle;
import shapes.Shape;

public class ParallelogramPainter {
private Parallelogram parallelogram;
	
	public ParallelogramPainter(Shape shape) {
		parallelogram = (Rectangle)shape;
	}
	
	public void draw(GraphicsContext gc) {
		gc.fillRect(parallelogram.getX(), parallelogram.getY(), parallelogram.getWidth(), parallelogram.getHeight());
		
	}
}
