package chapter17.iostream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharEncodingTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		File file = null;
		
		//---------------Output
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		File fileOut = null;
		
		file = new File("input.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis,"UTF-8");
		br = new BufferedReader(isr);

		fileOut = new File("output6.txt");
		fos = new FileOutputStream(fileOut);
		bos = new BufferedOutputStream(fos);
		
		String strData = null;
		while((strData =br.readLine())!= null) {
			System.out.println(strData);
			strData += "\n";
			byte[] b = strData.getBytes();
			bos.write(b);
		}
		System.out.println("succese save!");
		if(br!=null) {
			br.close();
		}
		if(bos!=null) {
			bos.close();
		}
	}

}
