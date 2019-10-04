package css_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("CSS");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
