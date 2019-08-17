package chapter04;

import java.util.Arrays;

public class Problem14 {
	private static int[] arr = new int[] {9,8,7,6,5,4,3,2,1};
	public static void pro14()	{
		int arr3=0;
		Arrays.sort(arr);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(" "+arr[i]);
			if(arr[i]==3) arr3=i;
		}
		System.out.println("\n3의 위치 : "+arr3);
	}
}
