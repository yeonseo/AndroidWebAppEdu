package chapter17.problem;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringToList {
	private static final Exception Exception = null;
	//---------------Input
	public static FileInputStream fis = null; public static InputStreamReader isr = null;
	public static BufferedReader br = null; public static File file = null;
	
	//---------------Output
	public static FileOutputStream fos = null; public static BufferedOutputStream bos = null;
	public static File fileOut = null;
	
	public static void main(String[] args) throws IOException {
		fileCat();
	}
	
	public static void sortInt() throws IOException{		
		List<Integer> list = new ArrayList<Integer>();
		
		file = new File("dataProblemInput.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis,"UTF-8");
		br = new BufferedReader(isr);

		fileOut = new File("dataProblemOutput.txt");
		fos = new FileOutputStream(fileOut);
		bos = new BufferedOutputStream(fos);

		String strData = null;
		while((strData =br.readLine())!= null) {
			list.add(Integer.parseInt(strData));
			System.out.println(Integer.parseInt(strData));
		}

		Collections.sort(list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next() + "\n";
			bos.write(str.getBytes());
		}
		System.out.println("succese save!");
		if(br!=null) { br.close(); }
		if(bos!=null) { bos.close(); }
	}
	
	public static void sortDouble() throws IOException{
		List<Double> list = new ArrayList<Double>();
		
		file = new File("dataProblemInputD.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis,"UTF-8");
		br = new BufferedReader(isr);

		fileOut = new File("dataProblemOutputD.txt");
		fos = new FileOutputStream(fileOut);
		bos = new BufferedOutputStream(fos);

		String strData = null;
		while((strData =br.readLine())!= null) {
			list.add(Double.parseDouble(strData));
			System.out.println(Double.parseDouble(strData));
		}

		Collections.sort(list);
		Iterator<Double> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next() + "\n";
			bos.write(str.getBytes());
		}
		System.out.println("succese save!");
		if(br!=null) { br.close(); }
		if(bos!=null) { bos.close(); }
		
	}
	
	public static void textPrint() throws IOException {
		file = new File("dataProblemInputD.txt");
		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis,"UTF-8");
		br = new BufferedReader(isr);

		String strData = null;
		int index = 0;
		while((strData =br.readLine())!= null) {
			System.out.printf("%d %-6c %s\n",index++,':', strData);
		}
		
	}
	public static void multiFileSum() throws IOException{		
		//문자열 읽어오는 스트림 열기 
		BufferedReader br = new BufferedReader(new FileReader("dataProblemOutput.txt")); 
		BufferedReader br2 = new BufferedReader(new FileReader("dataProblemOutputD.txt")); 
		//문자열 출력 버퍼스트림 
		BufferedWriter bw = new BufferedWriter(new FileWriter("merge.txt")); 

		String c; int iValue; double dValue;

		bw.write("------Integer------\n");
		while((c=br.readLine())!=null){ bw.write(c+"\n"); } 
		bw.write("------Double------\n");
		while((c=br2.readLine())!=null){ bw.write(c+"\n"); } 
		bw.flush(); System.out.println("합치기 종료");
		
		System.out.println("succese save!");
		if(br!=null) { br.close(); }
		if(br2!=null) { br2.close(); }
		if(bw!=null) { bw.close(); }
	}
	public static void fileCat() throws IOException{		
		FileInputStream fis1 = null;  FileInputStream fis2 = null;
        
        try {
            fis1 = new FileInputStream("dataProblemInput.txt");
            fis2 = new FileInputStream("dataProblemInput2.txt");
            fos = new FileOutputStream("fileCatResult.txt");

            int readData1 = 0; int readData2 = 0; 
            while(true){
            		readData1 = fis1.read();
            		readData2 = fis2.read();
            		if(readData1!=readData2||(readData1!=-1&&readData2==-1)) {
            			System.out.println("불일치~");
            			throw Exception;
            		}
            		if(readData1==-1) {
            			System.out.println("일치함미당!!!");
            			break;
            		}
            }           
        } catch (Exception e) { e.printStackTrace();
        }finally{
            try { fos.close();
            } catch (IOException e) { e.printStackTrace(); }
            try { fis1.close(); fis2.close();
            } catch (IOException e) { e.printStackTrace(); }
            	System.out.println("Cat done");
        }
	}

}
