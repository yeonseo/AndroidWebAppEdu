package diallog.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	@FXML private HBox hBox;
	public Stage primaryStage;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		Error!! 
//	   this.primaryStage = (Stage) hBox.getScene().getWindow();
//	   System.out.println("Stage : "+primaryStage);
	} //end initialize
	
	
	
	public void handleCustomFileChooser(ActionEvent event) {
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(hBox.getScene().getWindow());
		
		stage.setTitle("Custom Test!!!");
		stage.setResizable(false);
		
		try {
			HBox hBoxCustom = FXMLLoader.load(getClass().getResource("root_custom.fxml"));
			
			TextField textFieldKorean = (TextField) hBoxCustom.lookup("#textFieldKorean");
			TextField textFieldEnglish = (TextField) hBoxCustom.lookup("#textFieldEnglish");
			TextField textFieldMath = (TextField) hBoxCustom.lookup("#textFieldMath");
			TextField textFieldSum = (TextField) hBoxCustom.lookup("#textFieldSum");
			TextField textFieldAvg = (TextField) hBoxCustom.lookup("#textFieldAvg");
			Button buttonOK = (Button) hBoxCustom.lookup("#buttonOK");
			Button ButtonCancle = (Button) hBoxCustom.lookup("#ButtonCancle");
			
			buttonOK.setOnAction(event_custom-> {
				int sum = Integer.parseInt(textFieldKorean.getText())+
				Integer.parseInt(textFieldEnglish.getText())+
				Integer.parseInt(textFieldMath.getText());
				
				String sumStr = ""+(double)sum;
				String avgStr = ""+(double)sum/3.0;
				textFieldSum.setText(sumStr);
				textFieldAvg.setText(avgStr);
				
				System.out.println("Tatal : "+sum);
			});
			
			ButtonCancle.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					textFieldKorean.setText("");
					textFieldEnglish.setText("");
					textFieldMath.setText("");
					textFieldSum.setText("");
					textFieldAvg.setText("");
					
				}
			});
			
			Scene scene = new Scene(hBoxCustom);
			
			stage.setScene(scene);
			
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}