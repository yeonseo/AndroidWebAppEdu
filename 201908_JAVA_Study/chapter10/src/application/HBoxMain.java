package application;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HBoxMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		int width = 300;
		int space = 20;
		int fontSize = 50;
		
		HBox root = new HBox();
		root.setPrefWidth(width);
		root.setPrefHeight(width/3);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(space);
		
		TextField textFeild = new TextField();
		textFeild.setPrefWidth(200);
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(fontSize));
		
		Button buttonOK = new Button();
		buttonOK.setText("OK");
		Button buttonA = new Button();
		buttonA.setText("A");
		
		
		
		/*람다*/
//		buttonOK.setOnAction(event->Platform.exit());
		buttonOK.setOnAction((e)->Platform.exit());
		
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

	public static void main(String[] args) {
		launch(args);

	}

}
