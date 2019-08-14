package chapter04;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		System.out.println("숫자들의 합 : " +sum(new int[] {1,2,3,4}));		
	}
	public static int sum(int[] arr) {
		int total=0;
		for(int i=0 ; i < arr.length ; i++) {
			total=total + arr[i];
		}
		return total;
	}
}
//04-164
//public static void main(String[] args) {
//	int[] arrSeats= new int[10];
//	int[] arr= new int[10];
//	Scanner input = new Scanner(System.in);
//	for(int i=0 ; i < arr.length ; i++) {
//		arrSeats[i]=i+1;
//		arr[i]=0;
//	}
//	
//	do {
//		System.out.println("--------------------------");
//		for(int i=0 ; i < arr.length ; i++) {
//			System.out.print(arrSeats[i] + "  ");
//		}		
//		System.out.println("\n--------------------------");
//		for(int i=0 ; i < arr.length ; i++) {
//			System.out.print(arr[i] + "  ");
//		}		
//		System.out.println("\n--------------------------");
//		
//		System.out.print("예매하실 좌석을 선택하세요 : ");
//		int selectNum=input.nextInt();
//		if(arr[selectNum-1]==0) {
//			System.out.println("선택하신 좌석이 예매되었습니다.");
//			arr[selectNum-1]++;
//		}else System.out.println("선택하신 좌석은 선택불가합니다.");
//	}while(true);
//}
//04-163
//public static void main(String[] args) {
//	int[] arr= new int[6];
//	for(int i=0 ; i < 10000 ; i++) {
//		arr[(int) (Math.random()*(6-1+1))]++;
//	}
//
//	for(int i=0 ; i < arr.length ; i++) {
//		System.out.print((i+1)+" : "+arr[i]+"번   ");
//	}
//}
//04-161
//public static void main(String[] args) {
//	int[] arr= new int[10];
//	for(int i=0 ; i < arr.length ; i++) {
//		arr[i]=(int) (Math.random()*(20-1+1)+1);
//		System.out.print(arr[i]+" ");
//	}
//	System.out.println("");
//	
//	Scanner input = new Scanner(System.in);
//	System.out.print("찾을 값을 입력하세요 : ");
//	int searchNum=input.nextInt();
//
//	for(int i=0 ; i < arr.length ; i++) {
//		if(arr[i] == searchNum) {
//			System.out.println("searchNum : "+searchNum+"값의 위치 : " +(i+1)+"번째 ");
//		}
//	}
//}
//04-159
//public static void main(String[] args) {
//	int[] arr= new int[10];
//	for(int i=0 ; i < arr.length ; i++) {
//		arr[i]=(int) (Math.random()*(20-1+1)+1);
//		System.out.print(arr[i]+" ");
//	}
//	System.out.println("");
//	int min = arr[0];
//	int max = arr[0];
//	for(int i=0 ; i < arr.length ; i++) {
//		if(arr[i] > max) max=arr[i];
//		if(arr[i] < min) min=arr[i];
//	}
//	System.out.println("최대값 : "+max);
//	System.out.println("최소값 : "+min);
//}
//04-157
//public static void main(String[] args) {
//	int[] scores = {10,20,30,40};
//	for(int i=0 ; i <scores.length ; i++) {
//		System.out.print(scores[i]+" ");
//	}
//}
//}