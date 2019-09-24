package application.event.test2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	@FXML Label label;
	@FXML Button button1;
	@FXML Button button2;
	@FXML Button button3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*임시객체*/
		button1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String data = button1.getText();
				label.setText(data);
			}
		});
		/*람다식*/
		button2.setOnAction((event) ->{
				String data = button2.getText();
				label.setText(data);
		});
		
		button3.setOnAction((event)-> {
			handlerButton3Action(event);
		});
	}
	
	public void handlerButton3Action(ActionEvent e) {
		String data = button3.getText();
		label.setText(data);
	}
}
