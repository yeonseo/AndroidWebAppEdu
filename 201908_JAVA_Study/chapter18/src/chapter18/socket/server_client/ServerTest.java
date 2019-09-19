package chapter18.socket.server_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ServerTest {
	private static Map<String,String> map = new HashMap<String, String>();
	public static void main(String[] args) {
		map.put("아빠", "사릉행");
		map.put("엄마", "사릉행");
		map.put("엄댕", "사릉행");
		map.put("2019", "화이팅");
		ServerSocket server =null;
		System.out.println("Start");
		try {
			server = new ServerSocket(2200);
			while(true) {
				Socket clent = server.accept();
				Translator trans = new Translator(clent);
				trans.start();
			}
			
		}catch(IOException e) {
			
		}finally {
			try {
				System.out.println("end");
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static class Translator extends Thread{
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;
		public Translator(Socket socket) throws IOException {
			this.socket = socket;
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);
		}
		
		@Override
		public void run() {
			pw.println(socket.getPort() + " Hi :-) " + (socket.getInetAddress().getHostAddress()));
			
			try {
				while(true) {
					pw.println("단어입력하세요!");
					String data = br.readLine();
					if(data == null) break;
					Set<Entry<String,String>> set = map.entrySet();
					boolean find = false;
					for(Entry<String,String> entry : set) {
						String key = entry.getKey();
						if(key.equals(data)) {
							pw.println(data + " " + entry.getValue());
							find = true;
						}
					}
					if(!find) {
						pw.println("정신차려!!!!");
					}
					
//					if(data.equals("Java")) {pw.println("Java : 자바");}
//					else{pw.println("정신차려!!!!");}

				}//end of while
			}catch (IOException e) { e.printStackTrace();
			}finally {
				try { socket.close();
				} catch (IOException e) { e.printStackTrace();
				} finally {
					try { br.close(); pw.close(); } 
					catch (IOException e) { e.printStackTrace(); }
				}
			}//end of finally1
		}//end of run()
	}
}
