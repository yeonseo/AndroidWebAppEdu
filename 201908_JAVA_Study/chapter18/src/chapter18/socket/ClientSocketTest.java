package chapter18.socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.230",9100);
//		Socket socket = new Socket("LocalHost",9150);

		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		PrintStream ps = new PrintStream(bos);
		String str = "야~~~~야~야~ 내 나이가 어때서~";
		byte[] b = str.getBytes();
		ps.write(b);
		
		ps.println(str);
		ps.flush();
		
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("waiting for server recommend...");
		String data = br.readLine();
		System.out.println(data);
		br.close();

	}

}
