package chpter02;

import java.util.Scanner;

public class ToBinaryString {
	public static void main(String[] args) {
		int number=0;
		Scanner input = new Scanner(System.in);
		number=input.nextInt();
		toBinaryString(number);
	}
	
	public static void toBinaryString(int num) {
		String strValue=Integer.toBinaryString(num);
		while(strValue.length()<32) {
			strValue="0"+strValue;
		}
		System.out.println(num+ "> ÀÌÁø¹ı " +strValue);
	}
}
