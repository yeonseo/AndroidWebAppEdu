package chapter18.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("time-c.nist.gov",13);
		InputStream is = socket.getInputStream();
		InputStreamReader ist = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ist);
		
		String data = null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		
		if(br!=null) {
			br.close();
			System.out.println("program exit");
		}
	}

}
