package chapter14.problem;

public class Test {

	public static void main(String[] args) {
		sub();
	}
	public static void test0() {
		try 
		{
			System.out.print("Hello world ");
		}
		finally 
		{
			System.out.println("Finally executing");
		}
	}
	
	public static void test2() {
		try {
			int[] array=new int[-10];
			System.out.println("try");
		} catch (NumberFormatException e){ 
			System.out.println("숫자 형식 오류"); 
		} catch (NegativeArraySizeException e){ 
			System.out.println("배열 크기 음수 오류"); 
		} catch (Exception e){ 
			System.out.println("오류"); 
		}
	}
	
	public static void throwit() {
		System.out.print("A ");
		throw new RuntimeException();
	}
	public static void throwitMain(){
		try{
			System.out.print("B ");
			throwit();
		} catch (Exception re ) {
			System.out.print("C ");
		} finally {
			System.out.print("D ");
		}
		System.out.println("E ");
	}
	
	public static void test4() {
		try {
			someMethod();
			System.out.print("A"); 
		} catch (Exception ex) {
			System.out.print("B"); 
		} finally {
			System.out.print("C"); 
		} 
		System.out.print("D");	
	}
	
	public static void someMethod() {}
	
	public static void test5() {
		try 
		{ 
			int x = 0; 
			int y = 5 / x; 
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(" Arithmetic Exception"); 
		} catch (Exception e) {
			System.out.println("Exception"); 
		}
		System.out.println("finished");
	}
	
	
	public static void test6() {
		try
		{
			System.out.print("Hello world ");
		}
		finally
		{
			System.out.println("Finally executing ");
		}
	}
	
	public static void test7() {
//		int[] anArray = new int[3];
//		System.out.println(anArray[3]);
		
//		String[] strs = new String[3];
//		System.out.println(strs[0].length());
		
//		Integer.parseInt("abc");
		
		Object o = new Object();
		Integer i = (Integer)o;
	}
	
	
	public static void sub() {
		int[] array = new int[10];
		try {
			int i = array[10];
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array Bounds error");
		}
	}
}

