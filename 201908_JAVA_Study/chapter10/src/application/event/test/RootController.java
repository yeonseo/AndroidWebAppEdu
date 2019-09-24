package application.event.test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	@FXML private Label label;
	@FXML private Button button1;
	@FXML private Button button2;
	@FXML private Button button3;
	
	@Override
	public void initialize(URL args, ResourceBundle resources) {
		/*임시객체*/
		button2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String data = button2.getText();
				label.setText(data);
			}
		});
		/*람다식*/
		button3.setOnAction((event) ->{
				String data = button3.getText();
				label.setText(data);
		});
		
		button1.setOnAction((event)-> {
			handlerButton1Action(event);
		});
	}
	
	public void handlerButton1Action(ActionEvent e) {
		String data = button1.getText();
		label.setText(data);
	}

}
