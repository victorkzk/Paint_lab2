package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String strX = txtFieldX.getText();
		return isNumber(strX) ? Integer.parseInt(strX) : 0;
	}
	
	private int getY() {
		String strY = txtFieldY.getText();
		return isNumber(strY) ? Integer.parseInt(strY) : 0;
	}
	
	private int getWidth() {
		String strWidth = txtFieldWidth.getText();
		return isNumber(strWidth) ? Integer.parseInt(strWidth) : 0;
	}
	
	private int getHeight() {
		String strHeight = txtFieldHeight.getText();
		return isNumber(strHeight) ? Integer.parseInt(strHeight) : 0;
	}
	
	private boolean isNumber(String s) {
		Pattern numPattern = Pattern.compile("[0-9]+");
		Matcher numMatcher = numPattern.matcher(s);
		return numMatcher.matches();
	}
}
