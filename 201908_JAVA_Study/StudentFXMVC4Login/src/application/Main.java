package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {	
			Parent login = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
			Scene loginScene = new Scene(login);
			primaryStage.setTitle("로그인");
			primaryStage.setScene(loginScene);
            primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
