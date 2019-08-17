package chapter04;

public class Problem21 {
	public static void pro21() {
		System.out.print("16진수 문자열을 입력하시오 : ");
		String hex=Problem04Package.input.nextLine();
		int[] hexArr=new int[hex.length()];
		hexChange(hex,hexArr);
	}
	public static void hexChange(String hex,int[] hexArr) {
		for(int i=0; i<hex.length(); i++) {
			hexArr[i]=hex.charAt(i);
			hexPrint(hexArr[i]);
		}
	}
	public static void hexPrint(int hexPrint) {
		String[] hexa2bin=new String[] {"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111"};
		if(hexPrint<97) System.out.print(hexa2bin[hexPrint-49]+" ");
		else System.out.print(hexa2bin[hexPrint-87]+" ");;
	}
}
