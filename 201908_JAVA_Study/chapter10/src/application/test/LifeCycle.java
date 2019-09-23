package application.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Set;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LifeCycle extends Application{
	List<String> list;
	Map<String, String> map;
	Set<Entry<String, String>> set;
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" : "+"main run");
		launch(args);
		System.out.println(Thread.currentThread().getName()+" : "+"End");

	}
	
	public LifeCycle() {
		System.out.println(Thread.currentThread().getName()+" : "+"constructor run!");
	}

	@Override
	public void init() throws Exception {
		super.init();
		System.out.println(Thread.currentThread().getName() +" : "+"init run");
		
		Parameters ps = getParameters();
		
		System.out.println("-------List-------");
		list = ps.getRaw();
		for(String value : list) {
			System.out.println(value);
		}
		
		System.out.println("-------Map-------");
		map = ps.getNamed();
		set = map.entrySet();
		for(Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : "+key+" Value : "+value);
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		int width = 600;
		int space = 20;
		int fontSize = 20;
		
		VBox vBox = new VBox();
		vBox.setPrefWidth(width);
		vBox.setPrefHeight(width*2/3);
		vBox.setAlignment(Pos.BASELINE_CENTER);
		vBox.setSpacing(space);
		
		Label label = new Label();
		Label labelList = new Label();
		Label labelMap = new Label();
		
		String strList = "";
		String strMap = "";
		
		
		label.setText("Java HI!");
		label.setFont(new Font(fontSize));
		
		for(String value : list) {
			strList += value+" ";
		}
		labelList.setText(strList);
		
		for(Entry<String,String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			strMap += "Key : "+key+" value : "+value+" "; 
		}
		labelMap.setText(strMap);
		
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		
		Button button = new Button();
		button.setText("OK");
		button.setOnAction((e) -> Platform.exit());
		
		ObservableList<Node> list = vBox.getChildren();
		list.add(label);
		list.add(labelList);
		list.add(labelMap);
		list.add(textField);
		list.add(button);
		
		Scene scene = new Scene(vBox);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		System.out.println(Thread.currentThread().getName()+" : "+"start run");
		
	}
	
	public void stop() {
		System.out.println(Thread.currentThread().getName()+" : "+"stop run");
	}
	

}
