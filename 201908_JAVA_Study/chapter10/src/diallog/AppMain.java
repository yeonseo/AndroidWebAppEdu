package diallog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

//	public static Stage primaryEunhyeStage;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		primaryEunhyeStage = primaryStage;
//		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		FXMLLoader fxmlLoder = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = fxmlLoder.load();
		
		//Object object = fxmlLoder.getController();
		RootController rootController = fxmlLoder.getController();
		rootController.primaryStage = primaryStage;
		
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Dialog");
		primaryStage.show(); 

	}
	
	

	

}
