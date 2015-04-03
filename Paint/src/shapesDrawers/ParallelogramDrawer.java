package shapesDrawers;

import javafx.scene.canvas.GraphicsContext;
import shapes.Parallelogram;
import shapes.Shape;

public class ParallelogramDrawer implements Drawer{
	
	public void draw(Shape shape, GraphicsContext gc) {
		Parallelogram parallelogram = (Parallelogram)shape;
		double x[] = {parallelogram.getX(), 
				  	  parallelogram.getX() + parallelogram.getHeight(), 
				  	  parallelogram.getX() + parallelogram.getHeight() - parallelogram.getWidth()/Math.sqrt(2), 
				  	  parallelogram.getX() - parallelogram.getWidth()/Math.sqrt(2) };
	
		double y[] = {parallelogram.getY(), 
				  	  parallelogram.getY(), 
				  	  parallelogram.getY() + parallelogram.getWidth()/Math.sqrt(2), 
				  	  parallelogram.getY() + parallelogram.getWidth()/Math.sqrt(2) };
		gc.fillPolygon(x, y, 4);
		gc.strokePolygon(x, y, 4);
	}
}
