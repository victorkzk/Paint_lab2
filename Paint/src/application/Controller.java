package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import shapes.Shape;
import shapesDrawers.Drawer;

public class Controller implements Initializable{
	
	@FXML
	private TextField txtFieldWidth,
					  txtFieldHeight;
	@FXML
	private Canvas canvas;
	
	ShapeUpdater shapeUpdater = new ShapeUpdater();
	Shape shape = shapeUpdater.getEllipse();
	
	public void initialize(URL url, ResourceBundle resourseBundle) {
		txtFieldWidth.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
            	updWidthValue();
            }
        });
		
		txtFieldHeight.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
            	updHeightValue();
            }
        });
	}
	
	@FXML
	private void rbEllipseClick() {
		shape = shapeUpdater.getEllipse();
	}

	@FXML
	private void rbCircleClick() {
		shape = shapeUpdater.getCircle();
	}
	
	@FXML
	private void rbRectangleClick() {
		shape = shapeUpdater.getRectangle();
	}
	
	@FXML
	private void rbSquareClick() {
		shape = shapeUpdater.getSquare();
	}
	
	@FXML
	private void rbParallelogramClick() {
		shape = shapeUpdater.getParallelogram();
	}
	
	@FXML
	private void rbRhombusClick() {
		shape = shapeUpdater.getRhombus();
	}
	
	@FXML
	private void updWidthValue() {
		shapeUpdater.updateWidth(getWidth());
	}
	
	@FXML
	private void updHeightValue() {
		shapeUpdater.updateHeight(getHeight());
	}
	
	@FXML
	private void canvasOnClick(MouseEvent mouseEvent) {
		int posCursorX = (int)(mouseEvent.getSceneX() - canvas.getLayoutX());
		int posCursorY = (int)(mouseEvent.getSceneY() - canvas.getLayoutY());
		shape.setX(posCursorX);
		shape.setY(posCursorY);
		//shapeUpdater.updateHeight(50);
		//shapeUpdater.updateWidth(100);
		Drawer drawer = shape.getDrawer();
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.GREENYELLOW);
		gc.setLineWidth(2);
		gc.setStroke(Color.GREEN);
		drawer.draw(shape, gc);
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
