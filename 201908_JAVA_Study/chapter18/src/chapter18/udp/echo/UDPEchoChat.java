package chapter18.udp.echo;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UDPEchoChat {
	DatagramPacket packet;
	DatagramSocket socket;
	InetAddress address = null;
	private JTextField textField;
	private JTextArea textArea;
	final int myPort = 5000;
	final int otherPort = 6000;
	byte[] buf = new byte[256];
	String echo;
	
	public UDPEchoChat() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("localhost");
		socket = new DatagramSocket(myPort);
	}
	public void process() {
		try {
			while(true) {
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				echo = new String(buf);
				textArea.append("RECEIVE: "+ echo +"\n");
				//textArea.append("RECEIVE: "+ new String(buf) +"\n");
			}
		}catch(IOException e) {
			
		}
		
	}
	
	class MyFrame extends JFrame implements ActionListener{
		public MyFrame() throws HeadlessException {
			super("Echo");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			textField= new JTextField(30);
			textField.addActionListener(this);
			textArea=new JTextArea(10,30);
			textArea.setEditable(false);
			add(textField, BorderLayout.PAGE_END);
			add(textArea, BorderLayout.CENTER);
			
			pack();
			setVisible(true);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = textField.getText();
			buf = s.getBytes();
			DatagramPacket packet;
			
			packet = new DatagramPacket(buf, buf.length, address, otherPort);
			
			try {
				socket.send(packet);
				
			}catch(IOException e2) {
				
			}
			
			textArea.append("SEND : "+ new String(buf) +"\n");
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		UDPEchoChat c = new UDPEchoChat();
		c.process();

	}

}
