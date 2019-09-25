package application.draw;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

public class DrowController implements Initializable {
	static ArrayList<VertexClass> arPt = new ArrayList<VertexClass>();
    static boolean down = false;
    
	@FXML Canvas canvas;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public void handlerCuoserAction(MouseEvent event) {
		if(event.getEventType()==MouseEvent.MOUSE_CLICKED) {
			System.out.println("Hey!");
			System.out.println("X : "+ event.getX() + ", Y : "+event.getY()+" No Dorw");
			arPt.add(new VertexClass(event.getX(),event.getY(),false));
		}
		if(event.getEventType()==MouseEvent.MOUSE_DRAGGED ) {
			System.out.println("Hey!");
			System.out.println("X : "+ event.getX() + ", Y : "+event.getY()+" Dorw");
			arPt.add(new VertexClass(event.getX(),event.getY(),true));
			
		}

	}
	
}




