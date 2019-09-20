package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DatareciveTest {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(5000);
			
		}catch (Exception e) {
			
		}
		byte[] buf = new byte[1024];
		
		//패킷을 만든다.
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		try {
			ds.receive(dp);
			System.out.println(new String(buf));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ds.close();
		}

	}

}
