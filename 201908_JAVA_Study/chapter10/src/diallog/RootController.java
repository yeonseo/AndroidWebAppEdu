package diallog;

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
	public String string = "배고파요오";
	public Stage primaryStage;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		Error!! 
//	   this.primaryStage = (Stage) hBox.getScene().getWindow();
//	   System.out.println("Stage : "+primaryStage);
	} //end initialize
	
	public void handleOpenFileChooser(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("텍스트파일 ", "*.txt"),
				new ExtensionFilter("이미지파일 ", "*.png","*.jepg"),
				new ExtensionFilter("한글파일 ", "*.hwp"),
				new ExtensionFilter("PDF파일 ", "*.pdf"),
				new ExtensionFilter("모든 파일 ", "*.*")
		);
		
		File file  = fileChooser.showOpenDialog(primaryStage);
		//File file  = fileChooser.showOpenDialog(AppMain.primaryEunhyeStage);
		
		if(file!=null) {
			System.out.println("File : "+file.getPath());
		}
	}
	
	
	public void handleSaveFileChooser(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("텍스트파일 ", "*.txt"),
				new ExtensionFilter("이미지파일 ", "*.png","*.jepg"),
				new ExtensionFilter("한글파일 ", "*.hwp"),
				new ExtensionFilter("PDF파일 ", "*.pdf"),
				new ExtensionFilter("모든 파일 ", "*.*")
		);
		
		
		/*1*/
//		File file  = fileChooser.showSaveDialog(primaryStage);
		/*2*/
		File file  = fileChooser.showSaveDialog(hBox.getScene().getWindow());
		
		if(file!=null) {
			System.out.println("File : "+file.getPath());
		}
	}
	
	
	public void handleDirFileChooser(ActionEvent event) {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		
		File file = directoryChooser.showDialog(primaryStage);
		
		if(file!=null) {
			System.out.println("File : "+file.getPath());
		}
	}
	
	
	public void handlePopupFileChooser(ActionEvent event) {
		Popup popup = new Popup();
		HBox hBox;
		try {
			hBox = FXMLLoader.load(getClass().getResource("root_popup.fxml"));
			
			ImageView imageView = (ImageView) hBox.lookup("#imageView");
			Label label = (Label) hBox.lookup("#label");
			label.setText(string);
			imageView.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					popup.hide();
				}
			});
			
			popup.getContent().add(hBox);
			popup.setAutoHide(true);
			
			popup.show(this.hBox.getScene().getWindow());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void handleCustomFileChooser(ActionEvent event) {
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		
		stage.initOwner(hBox.getScene().getWindow());
		stage.setTitle("Custom");
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
			
			ButtonCancle.setOnAction(event_custom-> {
				textFieldKorean.setText("");
				textFieldEnglish.setText("");
				textFieldMath.setText("");
				textFieldSum.setText("");
				textFieldAvg.setText("");
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