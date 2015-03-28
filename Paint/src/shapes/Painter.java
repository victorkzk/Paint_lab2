package shapes;

import javafx.scene.canvas.GraphicsContext;

public class Painter {
	
	public static void draw(Ellipse ellipse, GraphicsContext gc) {
		gc.fillOval(ellipse.getX(), ellipse.getY(), ellipse.getWidth(), ellipse.getHeight());
	}
	
	public static void draw(Parallelogram parallelogram, GraphicsContext gc) {
		double x[] = {parallelogram.getX(), 
					  parallelogram.getX() + parallelogram.getHeight(), 
					  parallelogram.getX() + parallelogram.getHeight() - parallelogram.getWidth()/Math.sqrt(2), 
					  parallelogram.getX() - parallelogram.getWidth()/Math.sqrt(2) };
		
		double y[] = {parallelogram.getY(), 
					  parallelogram.getY(), 
					  parallelogram.getY() + parallelogram.getWidth()/Math.sqrt(2), 
					  parallelogram.getY() + parallelogram.getWidth()/Math.sqrt(2) };
		gc.fillPolygon(x, y, 4);
	}
	
	public static void draw(Rectangle rectangle, GraphicsContext gc) {
		gc.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
	}
}
