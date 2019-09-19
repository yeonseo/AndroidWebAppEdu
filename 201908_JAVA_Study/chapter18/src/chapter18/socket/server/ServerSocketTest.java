package chapter18.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerSocketTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9150);
		while(true) {
			System.out.println("waiting for client connection...");
			Socket socket = ss.accept(); //waiting for client access
			
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("waiting for server recommend...");
			String data = br.readLine();
			System.out.println(data);
			
			OutputStream os = socket.getOutputStream();
			PrintStream ps = new PrintStream(os);
			ps.println(new Date().toString());
			ps.close();
			break;
		} //end of while
		ss.close();
		
	}

}
