package application;
	
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static ExecutorService threadPool;
	public static Vector<Client> clients = new Vector<Client>();
	ServerSocket serverSocket;
	
	public void startServer(String IP, int port) {
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(IP, port));
			
		}catch(Exception e) {
			e.printStackTrace();
			if(!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}
		
		Runnable thread = new Runnable(){

			@Override
			public void run() {
				while(true){
					try {
						Socket socket = serverSocket.accept();
						clients.add(new Client(socket));
						System.out.println("[acsses client] "
								+ socket.getRemoteSocketAddress()
								+ " : " + Thread.currentThread().getName());
					} catch (Exception e) {
						e.printStackTrace();
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
					
				}
				
			}
			
		};
		threadPool = Executors.newCachedThreadPool();
		threadPool.submit(thread);
	}
	
	public void stopServer() {
		try {
			Iterator<Client> itr = clients.iterator();
			while(itr.hasNext()) {
				Client client = itr.next();
				client.socket.close();
				itr.remove();
			}
			if(serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if(threadPool != null && !threadPool.isShutdown()) {
				threadPool.isShutdown();
			}
		}catch(Exception e) {
			
		}
	}
	@Override
	public void start(Stage primaryStage) {
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
