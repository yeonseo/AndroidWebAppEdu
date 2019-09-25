package controller.test.circle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class RootController implements Initializable {
	@FXML private AnchorPane ancDivide;
	@FXML private Circle circle;
	@FXML private Text txtSay;
	
	
	
	@Override
	public void initialize(URL args, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(ancDivide.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(ancDivide.heightProperty(), 2));
	}
}
