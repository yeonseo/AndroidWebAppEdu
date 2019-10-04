package change_test;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootControllerCustom implements Initializable {
	@FXML private Button buttonMain;
	@FXML private AnchorPane ancCustom;
	
	@FXML private TextField textFieldKorean;
	@FXML private TextField textFieldEnglish;
	@FXML private TextField textFieldMath;
	@FXML private TextField textFieldSum;
	@FXML private TextField textFieldAvg;
	@FXML private Button buttonOK;
	@FXML private Button buttonClear;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		buttonMain.setOnAction((event) ->{
			hanbleButtonMainAction(event);
		});
		
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
		
		buttonClear.setOnAction(event_custom-> {
			textFieldKorean.setText("");
			textFieldEnglish.setText("");
			textFieldMath.setText("");
			textFieldSum.setText("");
			textFieldAvg.setText("");
		});
	} //end initialize
	
	/*메인 화면을 보여주는 이벤트처리*/
	public void hanbleButtonMainAction(ActionEvent event) {
		StackPane stackPane = (StackPane) buttonMain.getScene().getRoot();
		stackPane.getChildren().remove(ancCustom);
		
		
	}//end of hanbleButtonMainAction
	
	public void handleCustomFileChooser(ActionEvent event) {
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		
		stage.initOwner(ancCustom.getScene().getWindow());
		stage.setTitle("Custom");
		stage.setResizable(false);

		try {
			AnchorPane AnchorPaneCus = FXMLLoader.load(getClass().getResource("custom.fxml"));
			
			
			TextField textFieldKorean = (TextField) AnchorPaneCus.lookup("#textFieldKorean");
			TextField textFieldEnglish = (TextField) AnchorPaneCus.lookup("#textFieldEnglish");
			TextField textFieldMath = (TextField) AnchorPaneCus.lookup("#textFieldMath");
			TextField textFieldSum = (TextField) AnchorPaneCus.lookup("#textFieldSum");
			TextField textFieldAvg = (TextField) AnchorPaneCus.lookup("#textFieldAvg");
			Button buttonOK = (Button) AnchorPaneCus.lookup("#buttonOK");
			Button ButtonCancle = (Button) AnchorPaneCus.lookup("#ButtonCancle");
			
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
			
			Scene scene = new Scene(AnchorPaneCus);
			
			stage.setScene(scene);
			
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}