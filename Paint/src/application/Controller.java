package application;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import shapes.Ellipse;
import shapes.Painter;
import shapes.Parallelogram;
import shapes.Rectangle;

public class Controller {
	@FXML
	private Button btnEllipse,
				   btnCircle,
				   btnRectangle, 
				   btnSquare, 
				   btnParallelogram, 
				   btnRhombus;
	@FXML
	private TextField txtFieldWidth,
					  txtFieldHeight,
					  txtFieldX,
					  txtFieldY;
	@FXML
	private Canvas canvas;
	
	@FXML
	private void btnEllipseOnClick() {
		Ellipse ellipse = new Ellipse(getX(), getY(), getWidth(), getHeight());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.AQUA);
		Painter.draw(ellipse, gc);
	}
	
	@FXML
	private void btnCircleOnClick() {
		Ellipse ellipse = new Ellipse(getX(), getY(), getWidth());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.BLUE);
		Painter.draw(ellipse, gc);
	}
	
	@FXML
	private void btnRectangleOnClick() {
		Rectangle rectangle = new Rectangle(getX(), getY(), getWidth(), getHeight());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.GREEN);
		Painter.draw(rectangle, gc);
	}
	
	@FXML
	private void btnSquareOnClick() {
		Rectangle rectangle = new Rectangle(getX(), getY(), getWidth());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.GREENYELLOW);
		Painter.draw(rectangle, gc);
	}
	
	@FXML
	private void btnParallelogramOnClick() {
		Parallelogram parallelogram = new Parallelogram(getX(), getY(), getWidth(), getHeight());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.LIGHTCORAL);
		Painter.draw(parallelogram, gc);
	}

	@FXML
	private void btnRhombusOnClick() {
		Parallelogram parallelogram = new Parallelogram(getX(), getY(), getWidth());
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.CORAL);
		Painter.draw(parallelogram, gc);
	}
	
	@FXML
	private void canvasOnClick(MouseEvent mouseEvent) {
		int posCursorX = (int)(mouseEvent.getSceneX() - canvas.getLayoutX());
		int posCursorY = (int)(mouseEvent.getSceneY() - canvas.getLayoutY());
		txtFieldX.setText(String.valueOf(posCursorX));
		txtFieldY.setText(String.valueOf(posCursorY));
	}
	
	private int getX() {
		return Integer.parseInt(txtFieldX.getText());
	}
	
	private int getY() {
		return Integer.parseInt(txtFieldY.getText());
	}
	
	private int getWidth() {
		return Integer.parseInt(txtFieldWidth.getText());
	}
	
	private int getHeight() {
		return Integer.parseInt(txtFieldHeight.getText());
	}
}
