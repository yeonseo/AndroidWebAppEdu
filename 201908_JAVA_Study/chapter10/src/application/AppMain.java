package application;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.PortableServer.Current;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" : "+"main go!");
		launch(args);
		System.out.println("end");

	}
	
	public AppMain() {
		System.out.println(Thread.currentThread().getName()+" : "+"constructor go!");
	}
	@Override
	public void init() throws Exception {
		super.init();
		System.out.println(Thread.currentThread().getName()+" : "+"init call" );
		Parameters ps = getParameters();
		List<String> list = ps.getRaw();
		for(String value : list) {
			System.out.println(value);
		}
		
		Map<String, String> map = ps.getNamed();
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : "+key+" Value : "+value);
		}
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		System.out.println(Thread.currentThread().getName()+" : "+"start call");
		
	}
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+" : "+"stop call" );
	}
}
