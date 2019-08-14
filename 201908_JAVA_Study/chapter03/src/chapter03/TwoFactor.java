package chapter03;

import java.util.Scanner;

public class TwoFactor {
	public static void main(String[] agrs) {
		int num1=inputValue();
		int num2=inputValue();
		int result=Dcf(num1,num2);
		System.out.println("최대공약수 : "+result);
	}
	
	public static int inputValue() {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세오 : ");
		int num=input.nextInt();
		return num;
	}
	public static int Dcf(int num1, int num2) {
		int max=0;
		int min=0;
		if(num1>num2) {
			max=num1;
			min=num2;
		}else {
			min=num1;
			max=num2;
		}
		int z=0;
		while(min!=0) {
			z=max%min;
			max=min;
			min=z;
		}
		return max;
	}
}
