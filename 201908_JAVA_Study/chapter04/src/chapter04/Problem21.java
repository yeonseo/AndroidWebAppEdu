package chapter04;

import java.util.Scanner;

public class Problem21 {
	public static void pro21() {
		System.out.print("16진수 문자열을 입력하시오 : ");
		String hex=MainProblem04.input.nextLine();
		int[] hexArr=new int [hex.length()];
		char[] hexArrChar=new char [hex.length()];
		hexChange(hex,hexArr,hexArrChar);
	}
	public static void hexChange(String hex,int[] hexArr,char[] hexArrChar) {
		for(int i=0; i<hex.length(); i++) {
			hexArr[i]=hex.charAt(i);
			//hexPrint(hexArr[i]);
			toBinaryString(hexArr[i]);
		}
	}
	public static void hexPrint(int hexPrint) {
		String[] hexa2bin=new String[] {"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111"};
		if(hexPrint<97) System.out.print(hexa2bin[hexPrint-49]+" ");
		else System.out.print(hexa2bin[hexPrint-87]+" ");
	}
	
	public static void toBinaryString(int hexArr) {
		 if(hexArr >= '0' && hexArr <= '9') hexArr = hexArr-'0';
         if(hexArr >= 'a' && hexArr <= 'f') hexArr = hexArr-'a'+10;
         if(hexArr >= 'A' && hexArr <= 'F') hexArr = hexArr-'A'+10;
		String binary = Integer.toBinaryString(hexArr);
		
		while(binary.length()<4) {
			binary="0"+binary;
		}System.out.print(binary+" ");
	}
//Cha Hoon's Code
//	public static String[] hexa2bin = {"0000","0001","0010","0011"
//            ,"0100","0101","0110","0111"
//            ,"1000","1001","1010","1011"
//            ,"1100","1101","1110","1111"};
//	 public static void main(String[] args) {
//	      Scanner scan = new Scanner(System.in);
//	      System.out.print("16진수 문자열을 입력하시오 : ");
//	      String str = scan.nextLine();
//	      print(str);
//	   }
//	   public static void print(String s) {
//	      for(int i=0;i<s.length();i++) {
//	         char HEXA = s.charAt(i);
//	         int index = 0;
//	         if(HEXA >= '0' && HEXA <= '9') index = (HEXA-'0');
//	         if(HEXA >= 'a' && HEXA <= 'f') index = 10+(HEXA-'0');
//	         if(HEXA >= 'A' && HEXA <= 'F') index = 10+(HEXA-'0');
//	         System.out.print(hexa2bin[index]);
//	      }
//	      System.out.print(" ");
//	   }
}
