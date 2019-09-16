package chapter17.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		fi = new FileInputStream("input.txt");
		fo = new FileOutputStream("output.txt");
		
		int data;
		while((data = fi.read())!=-1) {
			fo.write(data);
			
		}
		if(fi!=null) {
			fi.close();
			
		}
		if(fo!=null) {
			fo.close();
		}
	}

}
