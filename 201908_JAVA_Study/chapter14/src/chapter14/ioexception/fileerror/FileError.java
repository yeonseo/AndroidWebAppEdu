package chapter14.ioexception.fileerror;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileError {
	//member const, int[]
	private static final int SIZE; static { SIZE = 10;}
	private int[] list;
	
	//constructor
	public FileError() {
		super();
		this.list = new int[SIZE];
		for(int i = 0 ; i <list.length ; i++) {
			list[i] = i;
		}
		writelist();
	}
	
	public void writelist() {
		//data print to file
		PrintWriter pw = null; //file open and will write
		try {
			pw = new PrintWriter(new FileWriter("outFile.txt"));
			for(int i = 0 ; i <list.length ; i++) {
				pw.println("array "+i+" : "+list[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("out of array bounds");
		} finally {
			if(pw != null) {
				pw.close();
				System.out.println("file creat!");
			}
		}
	}
}
