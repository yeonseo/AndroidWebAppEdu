package application.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class AppMainStageScene extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loder = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loder.load();
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppStageScene");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

//class DrawCanvas extends Canvas{
//	 ArrayList<VertexClass> arPt;
//	 DrawCanvas(ArrayList<VertexClass> arPt) {
//           this.arPt = arPt;
//    }
//	 
//	 public void paint(Line g) {
//		 for (int i = 0 ; i < arPt.size() - 1; i++) {
//			 if (arPt.get(i + 1).draw) {
//				 g = new Line(arPt.get(i).x, arPt.get(i).y, arPt.get(i+1).x, arPt.get(i+1).y);
//			 }
//		 }
//	 }
//}
