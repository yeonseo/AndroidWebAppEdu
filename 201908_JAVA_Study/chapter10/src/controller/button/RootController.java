package controller.button;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable {
	@FXML private CheckBox chkGlasses;
	@FXML private CheckBox chkHat;
	@FXML private ImageView imgHuman;
	@FXML private RadioButton rdoBubble;
	@FXML private RadioButton rdoBar;
	@FXML private RadioButton rdoArea;
	@FXML private ImageView imgGraph;
	@FXML private Button btnExit;
	
	@Override
	public void initialize(URL args, ResourceBundle resources) {
		
	
	}
	
	public void handlerCheckBoxAction(ActionEvent event) {
		if(chkGlasses.isSelected() && chkHat.isSelected()) {
			imgHuman.setImage(new Image(getClass().getResource("images/geek-glasses-hair.gif").toString()));
		} else if(chkGlasses.isSelected()) {
			imgHuman.setImage(new Image(getClass().getResource("images/geek-glasses.gif").toString()));
		} else if(chkHat.isSelected()) {
			imgHuman.setImage(new Image(getClass().getResource("images/geek-hair.gif").toString()));
		} else {
			imgHuman.setImage(new Image(getClass().getResource("images/geek.gif").toString()));
		} 
		
	}//end of handlerCheckBoxAction()

	public void handlerButtonExitAction(ActionEvent event) {
		Platform.exit();
	}

}
