package application;

import java.util.Observable;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMainStageScene extends Application{
	public boolean fontValue = false;
	public Label label = new Label();
	public int width = 600;
	public int space = 20;
	public int fontSize = 50;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
//		HBox root = new HBox();
		root.setPrefWidth(width);
		root.setPrefHeight(width/3);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(space);
		

		Button buttonOK = new Button();
		buttonOK.setText("OK");
		Button buttonA = new Button();
		buttonA.setText("Exit");
		
		
//		/*람다*/
//		buttonOK.setOnAction((event)-> {
//				if(fontValue) {
//					label.setText("HELLO");
//					label.setFont(new Font(30));
//				}
//				else {
//					label.setText("Hello, JavaFX");
//					label.setFont(new Font(fontSize));
//				}
//				fontValue=!fontValue;
//		});
		
//		/*임시객체*/
		buttonOK.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(fontValue) {
					label.setText("HELLO");
					label.setFont(new Font(30));
					}
					else {
						label.setText("Hello, JavaFX");
						label.setFont(new Font(fontSize));
					}
				fontValue=!fontValue;
			}
		});
	
		/*함수식*/
		buttonOK.setOnAction((event)-> {
			handlerAction(event);
		});

		buttonA.setOnAction((e)->Platform.exit());

//		root.getChildren().add(label);
//		root.getChildren().add(buttonOK);
//		root.getChildren().add(buttonA);
		
		
		ObservableList<Node> list = root.getChildren();
		list.add(label);
		list.add(buttonOK);
		list.add(buttonA);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppStageScene");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void handlerAction(ActionEvent event) {
		if(fontValue) {
		label.setText("HELLO");
		label.setFont(new Font(30));
		}
		else {
			label.setText("Hello, JavaFX");
			label.setFont(new Font(fontSize));
		}
		fontValue=!fontValue;
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
