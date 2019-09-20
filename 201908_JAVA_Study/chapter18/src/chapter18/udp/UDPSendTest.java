package chapter18.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPSendTest {
	
	public static void main(String[] args) {
		DatagramSocket ds = null;
		InetAddress ia = null;
		try {
			ds = new DatagramSocket(6000);
			
		}catch (Exception e) {
			
		}
		String data = new String("내 운명은 내가 만든다.");
		byte[] buf = data.getBytes();
		
		try {
			ia = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//패킷을 만든다.
		DatagramPacket dp = new DatagramPacket(buf, buf.length, ia, 5000);
		try {
			ds.send(dp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ds.close();
		}
		
	}
}
