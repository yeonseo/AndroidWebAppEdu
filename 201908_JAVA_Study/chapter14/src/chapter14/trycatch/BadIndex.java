package chapter14.trycatch;

import java.util.EmptyStackException;

public class BadIndex {
	public static final int NO; static {NO = 10;}
	public static void main(String[] args) {
		int[] array = new int[NO];
		int result;
		for(int i = 0 ; i < array.length ; i++) {
			array[i]=i;
		}
		
		
		try {
			result = array[12];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류!!!");
			result = array[9];
		}
		System.out.println("문장 실행 : "+result);
		
		System.out.println("calculator~");
		
		testPrint();
		int num = 0;
		try {
			num = 10/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			num = 10/1;
			e.getMessage();
		}finally{
			System.out.println("program eixt");
		}
		System.out.println("result : "+num);
	}
	
	private static void testPrint() {
		System.out.println("function run");
		int num = 0;
		try {
			num = 10/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("function error");
			throw new EmptyStackException();
		}
		System.out.println("result : "+num);
	}
}
