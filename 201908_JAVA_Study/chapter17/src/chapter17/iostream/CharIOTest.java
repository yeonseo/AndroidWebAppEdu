package chapter17.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOTest {

	public static void main(String[] args) {
		FileReader r = null;
		FileWriter w = null;
	
		try {
			r = new FileReader("input.txt");
			w = new FileWriter("output2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		int data = 0;
		
		try {
			while((data = r.read())!=-1) {
				w.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("succese !!");
		
		
		if(r!=null) {
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if(w!=null) {
			try {
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
