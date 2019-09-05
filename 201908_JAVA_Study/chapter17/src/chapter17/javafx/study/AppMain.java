package chapter17.javafx.study;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application{
	public AppMain() {
		System.out.println(Thread.currentThread().getName()+" : AppMain()");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+" : init()");
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName()+" : start()");
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		
		Label label = new Label();
		label.setText("Hello :-)");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("OK");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+" : stop()");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" : main()");
		launch(args);
	}

}
