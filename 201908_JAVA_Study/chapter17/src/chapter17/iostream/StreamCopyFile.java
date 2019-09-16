package chapter17.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		fi = new FileInputStream("input.txt");
		fo = new FileOutputStream("output.txt");
		
		int data;
		while((data = fi.read())!=-1) {
			fo.write(data);
			//System.out.print((byte)data);
		}
		
		System.out.println("succese copy!!!");
		if(fi!=null) {
			fi.close();
			
		}
		if(fo!=null) {
			fo.close();
		}
		
		
		
		FileInputStream fiImage = null;
		FileOutputStream foImage = null;
		
		fiImage = new FileInputStream("catIOTest.jpeg");
		foImage = new FileOutputStream("catIOTest_copy.jpeg");
		
		while((data = fiImage.read())!=-1) {
			foImage.write(data);
			//System.out.print((byte)data);
		}
		
		System.out.println("succese copy!!!");
		if(fiImage!=null) {
			fiImage.close();
			
		}
		if(foImage!=null) {
			foImage.close();
		}
	}

}
