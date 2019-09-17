package chapter17.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyLineBuffer {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		FileWriter fo = null;
		InputStreamReader isr = null;
		
		fi = new FileInputStream("input.txt"); //1Byte
		isr = new InputStreamReader(fi);
		fo = new FileWriter("output3.txt"); //2Byte
		
		int data;
		while((data = isr.read())!=-1) {
			fo.write(data);
			//System.out.print((byte)data);
		}
		
		System.out.println("succese copy!!!");
		if(isr!=null) {
			isr.close();
			
		}
		if(fo!=null) {
			fo.close();
		}
		
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		BufferedWriter bufferWriter = null;
		//------------ Data Reading
		fr = new FileReader("input.txt");
		br = new BufferedReader(fr);
		
		//------------ Data Saving
		fw = new FileWriter("output4.txt");
		bufferWriter = new BufferedWriter(fw); //Using it Time : 239008, Not using it Time : 266071
		pw = new PrintWriter(fw);
		
		
		String strData = null;
		long startTime = System.nanoTime();
		while((strData=br.readLine()) !=null) {
			pw.println(strData);
		}
		long endTime = System.nanoTime();
		System.out.println("succese copy!!! Time : " + (endTime - startTime));
		if(br!=null) {
			br.close();
			
		}
		if(pw!=null) {
			pw.close();
		}

	}

}
