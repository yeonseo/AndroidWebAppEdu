package chapter03;

import java.util.Scanner;

public class TwoFactor {
	public static void main(String[] agrs) {
		
		
		System.out.println("첫번째 정수를 입력하세요.");
		int numOne = inputValue();
		System.out.println("두번째 정수를 입력하세요.");
		int numTwo = inputValue();
		int z;
		if(numOne<numTwo) {
			z = numOne; numOne= numTwo;numTwo=z;
		}
		
		while(true) {
			if(numTwo==0) {
				System.out.println("최대 공약수 : "+numOne);
				break;
			}else {
				z = numOne%numTwo; numOne= numTwo; numTwo=z;
			}
		}
	}
	
	public static int inputValue() {
		int num;
		Scanner input = new Scanner(System.in); 
		do {
			System.out.print("1~100 사이의 정수를 입력하세요 : ");
			num = input.nextInt();
		}while(num<0||num>100);
		return num;
	}
}
