package chapter04;

public class MaxMin {
	public static void main(String[] args) {
		//1. 배열 선언
		int[] arr = new int[10];
		//2. 배열 10개 랜덤 (1-20) (for.length)
		for(int i=0; i<arr.length ; i++) {
			arr[i]=(int) (Math.random()*(20-1+1)+1);
		}
		int max=0, min=0;
		max = max(arr);
		min = min(arr);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	public static int max (int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]>max) max = arr[i];
		}
		return max;
	}
	public static int min (int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]<min) min = arr[i];
		}
		return min;
	}
}

