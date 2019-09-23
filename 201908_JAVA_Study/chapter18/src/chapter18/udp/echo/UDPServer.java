package chapter18.udp.echo;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UDPServer {
	DatagramPacket packet;
	DatagramSocket socket;
	InetAddress address = null;
	private JTextField textField;
	private JTextArea textArea;
	final int myPort = 6000;
	final int otherPort = 5000;
	
	public UDPServer() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("localhost");
		socket = new DatagramSocket(myPort);
	}
	public void process() {
		try {
			while(true) {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				
				textArea.append("RECEIVE: "+new String(buf) +"\n");
				
				packet = new DatagramPacket(buf, buf.length, address, otherPort);
				
				try {
					socket.send(packet);
					
				}catch(IOException e2) {
					
				}
				
				textArea.append("SEND : "+ new String(buf) +"\n");
				textField.selectAll();
				textArea.setCaretPosition(textArea.getDocument().getLength());
			}
		}catch(IOException e) {
			
		}
		
	}
	
	class MyFrame extends JFrame {
		public MyFrame() throws HeadlessException {
			super("Server");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			textField= new JTextField(30);
			textArea=new JTextArea(10,30);
			textArea.setEditable(false);
			add(textField, BorderLayout.PAGE_END);
			add(textArea, BorderLayout.CENTER);
			
			pack();
			setVisible(true);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		UDPServer c = new UDPServer();
		c.process();

	}
}
