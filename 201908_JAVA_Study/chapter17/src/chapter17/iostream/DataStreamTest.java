package chapter17.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		//-----------File reading class
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		File file = null;
		//-----------File writing class
		FileOutputStream fos = null;
		BufferedOutputStream bos= null;
		DataOutputStream dos = null;
		File file2 = null;
		
		file2 = new File("data.bin");
		fos = new FileOutputStream(file2);
		bos = new BufferedOutputStream(fos);
		dos = new DataOutputStream(bos);
		
		dos.writeDouble(3.14);
		dos.writeInt(100);
		dos.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다.");
		dos.flush(); //Save Data in buffer
		if(dos!=null) {
			System.out.println("succese!!!");
		}
		
		//file reading
		file = new File("data.bin");
		fis = new FileInputStream(file2);
		bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
		
		// 꼭!!! 저장된 순서대로 읽어와야 한다. ------> 이것을 해결하는게 데이터베이스!!!!!
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		
		if(dis!=null) {
			dis.close();
		}
		
	}

}
