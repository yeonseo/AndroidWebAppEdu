package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppliMain extends Application {
	
	public static void main(String[] args) {
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
				
		        
				Parent HBox=FXMLLoader.load(getClass().getResource("/View/login.fxml"));	
				Scene scene=new Scene(HBox); 
				primaryStage.setScene(scene);
				primaryStage.setTitle("studentMVC");
				primaryStage.show();

	}


}
