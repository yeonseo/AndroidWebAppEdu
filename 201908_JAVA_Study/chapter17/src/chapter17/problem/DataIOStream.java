package chapter17.problem;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStream {

	public static void main(String[] args) throws IOException {
		//-----------File writing class
		FileInputStream fis = null; BufferedInputStream bis = null;
		DataInputStream dis = null; File file = null;
		
		FileOutputStream fos = null; BufferedOutputStream bos= null;
		DataOutputStream dos = null; File file2 = null;
		
		file2 = new File("dataProblem.txt"); fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos); dos = new DataOutputStream(bos);
		
		dos.writeInt(123);
		dos.writeShort(100);
		dos.writeLong(1234567890);
		dos.writeFloat(3.04f);
		dos.writeDouble(3.14);
		dos.flush(); //Save Data in buffer
		if(dos!=null) { System.out.println("succese!!!"); }
		
		//file reading
		file = new File("dataProblem.txt"); fis = new FileInputStream(file2);
		bis = new BufferedInputStream(fis); dis = new DataInputStream(bis);
		
		// 꼭!!! 저장된 순서대로 읽어와야 한다. ------> 이것을 해결하는게 데이터베이스!!!!!
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		if(dis!=null) { dis.close(); }

	}

}
