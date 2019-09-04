package chapter14.ioexception.bufferin;

import java.io.IOException;

public class bufferTest {
	public static int SIZE= 100;
	public static void main(String[] args) throws IOException {
		System.out.println(readString());
//		try {
//			System.out.println(readString());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	private static String readString() throws IOException {
		byte[] buffer = new byte[SIZE];
		
		System.out.print("Enter char : ");
		System.in.read(buffer);
		return new String(buffer);
	}

}
