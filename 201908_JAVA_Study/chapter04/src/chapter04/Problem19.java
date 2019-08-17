package chapter04;

public class Problem19 {
	private static int[] arr = new int[10];
	public static void pro19() {
		countStar(arr);
		printStar(arr);
	}
	public static void countStar(int[] arr) {
		for (int i=0 ; i < 100 ; i++) {
			int num = (int) (Math.random()*(100-2+1)+1);
			 arr[(num-1)/10]++;
		}
	}
	public static void printStar(int[] arr) {
		for(int i=0 ; i < arr.length ; i++) {
			System.out.print((i*10+1)+" - "+((i+1)*10)+" : ");
			for(int j=0 ; j <= arr[i] ; j++) {
				System.out.print("*");
			}System.out.println("");
		}
	}
}
