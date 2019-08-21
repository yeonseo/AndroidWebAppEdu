package chapter05.test;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int[] num1 = new int[] {1,2,3,4,5};
		for (int value : num1) {
			System.out.println(value);
		}
		System.out.println("");
		int[] num2 = arraysCopyOf(num1);
		for (int value : num2) {
			System.out.println(value);
		}
		
		//Check the address difference of two arrays
		System.out.println("");
		System.out.println(num1);
		System.out.println(num2);
	}
	public static int[] arraysCopyOf(int[] num1) {
		int[] num2=new int[num1.length];
		for(int i=0 ; i < num1.length ; i++) {
			num2[i]=num1[i];
		}
		return num2;
	}
}
