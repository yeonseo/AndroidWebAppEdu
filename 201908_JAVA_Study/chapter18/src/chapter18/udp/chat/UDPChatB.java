package chapter18.udp.chat;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chapter18.udp.chat.UDPChat.MyFrame;

public class UDPChatB {
	DatagramPacket packet;
	DatagramSocket socket;
	InetAddress address = null;
	private JTextField textField;
	private JTextArea textArea;
	final int myPort = 6000;
	final int otherPort = 5000;
	
	public UDPChatB() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("192.168.0.210");
		socket = new DatagramSocket(myPort);
	}
	public void process() {
		try {
			while(true) {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				
				textArea.append("RECEIVE: "+new String(buf) +"\n");
			}
		}catch(IOException e) {
			
		}
		
	}
	
	class MyFrame extends JFrame implements ActionListener{
		public MyFrame() throws HeadlessException {
			super("MessageB");
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
			byte[] buffer = s.getBytes();
			DatagramPacket packet;
			
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			
			try {
				socket.send(packet);
				
			}catch(IOException e2) {
				
			}
			
			textArea.append("SEND : "+s+"\n");
			textField.selectAll();
			textArea.setCaretPosition(textArea.getDocument().getLength());
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		UDPChatB c = new UDPChatB();
		c.process();

	}
}
