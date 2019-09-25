package controller.circle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable {
	@FXML private AnchorPane ancDivide;
	@FXML private Circle circle;
	
	
	@Override
	public void initialize(URL args, ResourceBundle resources) {
		
		circle.centerXProperty().bind(Bindings.divide(ancDivide.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(ancDivide.heightProperty(), 2));
		
//		ancDivide.widthProperty().addListener(new ChangeListener<Number>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				circle.setCenterX(newValue.doubleValue()/2);
//				
//			}
//		});
//		ancDivide.heightProperty().addListener(new ChangeListener<Number>() {
//			
//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				circle.setCenterY(newValue.doubleValue()/2);
//				
//			}
//		});
		
		
		
	}
}
