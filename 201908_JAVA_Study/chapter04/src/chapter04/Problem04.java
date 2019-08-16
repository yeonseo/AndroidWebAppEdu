package chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class Problem04 {
	private static int[] arr = new int[10];
	
	public static void main(String[] args) {
		countStar(arr);
		printStar(arr);
	}
	public static void countStar(int[] arr) {
		for (int i=0 ; i < 100 ; i++) {
			int num = (int) (Math.random()*(100-2+1)+1);
			 arr[(num-i)/10]++;
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
//21
//public static Scanner input = new Scanner(System.in);
//
//public static void main(String[] args) {
//	
//	System.out.print("16진수 문자열을 입력하시오 : ");
//	
//	String hex=input.nextLine();
//	int[] hexArr=new int[hex.length()];
//	hexChange(hex,hexArr);
//}
//public static void hexChange(String hex,int[] hexArr) {
//	for(int i=0; i<hex.length(); i++) {
//		hexArr[i]=hex.charAt(i);
//		//System.out.println(hexArr[i]);
//		hexPrint(hexArr[i]);
//	}
//}
//public static void hexPrint(int hexPrint) {
//	String[] hexa2bin=new String[] {"0000","0001","0010","0011",
//			"0100","0101","0110","0111",
//			"1000","1001","1010","1011",
//			"1100","1101","1110","1111"};
//	char[] hexa2bin2=new char[] {49,50,51,52,53,54,55,56,57,58,59,97,98,99,100,101};
//	for(int i=0; i<hexa2bin.length;i++) {
//		if(hexPrint==hexa2bin2[i]) System.out.print(hexa2bin[i]+" ");
//	}
//}
//20
//public static Scanner input = new Scanner(System.in);
//
//public static void main(String[] args) {
//	System.out.print("학생수를 입력하세요 : ");
//	int studentNum=input.nextInt();
//	int[] arr = new int[studentNum];
//	
//	grade(arr);
//	double result = average(arr);
//	System.out.println(result);
//}
//public static void grade(int[] arr) {
//	for (int i=0 ; i < arr.length ; i++) {
//		do {
//			System.out.print("학생"+(i+1)+"의 성적을 입력하세요 : ");
//			arr[i]=input.nextInt();
//			if(arr[i]<0||arr[i]>100) System.out.println("잘못입력하셨습니다.");
//		}while(arr[i]<0||arr[i]>100);
//	}
//}
//public static double average(int[] arr) {
//	double result = 0.0; 
//	for(int i=0 ; i < arr.length ; i++) {
//		result=result+(double)arr[i];
//	}
//	return result/(double)arr.length;
//}
//19
//private static int[] arr = new int[10];
//
//public static void main(String[] args) {
//	countStar(arr);
//	printStar(arr);
//}

//18
//private static String[] arr1 = new String[] {"Clubs","Diamonds","Hearts","Spades"};
//private static String[] arr2 = new String[] {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
//
//public static void main(String[] args) {
//	randomCard(arr1,arr2);
//}
//public static void randomCard(String[] arr1, String[] arr2) {
//	String arr1Random = arr1[(int) (Math.random()*(4-1)+1)];
//	String arr2Random = arr2[(int) (Math.random()*(14-1)+1)];
//	
//	System.out.println(arr1Random+"의 "+arr2Random);
//}
//16
//private static int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9};
//private static int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9};
//private static int[] arr3 = arr2;
//public static boolean bool = false;
//public static void main(String[] args) {
//	
//	bool = arrEquals(arr1,arr2);
//	System.out.println(bool);
//	bool = arrEquals(arr2,arr3);
//	System.out.println(bool);
//}
//public static boolean arrEquals(int[] arr1, int[] arr2) {
//	bool = arr1.equals(arr2);
//	return bool;
//}
//15
//private static String[] arr = new String[] {"Hello","Java", "World"};
//public static void main(String[] args) {
//	
//	for(int i=0 ; i<arr.length ; i++) {
//		System.out.println(arr[i]);	
//	}
//}
//14
//private static int[] arr = new int[] {9,8,7,6,5,4,3,2,1};
//public static void main(String[] args) {
//	//14
//	int arr3=0;
//	Arrays.sort(arr);
//	for(int i=0 ; i<arr.length ; i++) {
//		System.out.print(" "+arr[i]);
//		if(arr[i]==3) arr3=i;
//	}
//	System.out.println("\n3의 위치 : "+arr3);
//}
//13
//public static void main(String[] args) {
//	double[] d = new double[] {1.0, 2.0, 3.0, 4.0};
//	for(double number: d) {
//		System.out.println(number);
//	}
//}
//12
//public static void main(String[] args) {
//	double[] d = new double[] {1.0, 2.0, 3.0, 4.0};
//	max(d);
//}
//public static void max(double[] d) {
//	double max = d[0];
//	for(int i=0 ; i < d.length ; i++) {
//		if(d[i] > max) max=d[i];
//	}
//	System.out.println("최대값 : "+max);
//}

//11
//private static int[] x=new int[] {333,555,999};
//public static void main(String[] args) {
//	System.out.println(x[0]);
//}


//private static float[] f = new float[2]; 
//public static void main(String[] args){
//	pro07();
//	pro08();		
//}
//
//public static void pro07()	{
//	double[] d = new double[10];
//	System.out.println("f[0] = " +f[0]); 
//}
//public static void pro08()	{
//	double[] d = new double[10];
//	init(d);
//}	
//public static void init(double[] d)	{
//	for(int i = 0 ; i <d.length ; i++) {
//		d[i]=i+1.0;
//		System.out.println(d[i]);
//	}
//}