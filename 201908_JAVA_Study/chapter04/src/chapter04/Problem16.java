package chapter04;

public class Problem16 {
	private static int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9};
	private static int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9};
	private static int[] arr3 = arr2;
	public static boolean bool = false;
	public static void pro16()	{
		bool = arrEquals(arr1,arr2);
		System.out.println(bool);
		bool = arrEquals(arr2,arr3);
		System.out.println(bool); 
	}
	public static boolean arrEquals(int[] arr1, int[] arr2) {
		bool = arr1.equals(arr2);
		return bool;
	}
}
