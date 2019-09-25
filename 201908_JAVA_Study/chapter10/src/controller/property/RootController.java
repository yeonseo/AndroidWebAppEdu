package controller.property;

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
		txtReceive.textProperty().bind(txtSend.textProperty());
//		txtReceive.textProperty().bindBidirectional(txtSend.textProperty());
		
//		txtSend.setOnKeyReleased(new EventHandler<Event>() {
//			@Override
//			public void handle(Event event) {
//				//String data = txtSend.getText();
//				
//				int dataLength = txtSend.getLength();
//				String dataHead = txtSend.getText(dataLength-1, dataLength);
//				String targetData = txtReceive.getText();
//				txtReceive.setText(targetData);
//				
//			}
//		});
		
		
//		btnBind.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent event) {
//				Bindings.bindBidirectional(txtSend.textProperty(), txtReceive.textProperty());
//				
//			}
//		});
//		btnUnBind.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override
//			public void handle(ActionEvent event) {
//				Bindings.unbindBidirectional(txtSend.textProperty(), txtReceive.textProperty());
//				
//			}
//		});
	}

}
