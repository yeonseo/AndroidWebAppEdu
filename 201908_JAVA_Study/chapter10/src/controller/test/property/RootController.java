package controller.test.property;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {
	@FXML private TextArea txtReceive;
	@FXML private TextArea txtSend;
	@FXML private Button btnBind;
	@FXML private Button btnUnBind;
	
	@Override
	public void initialize(URL args, ResourceBundle resources) {
		//txtReceive.textProperty().bind(txtSend.textProperty());
		txtReceive.textProperty().bindBidirectional(txtSend.textProperty());
		
		
	}
	
	

}
