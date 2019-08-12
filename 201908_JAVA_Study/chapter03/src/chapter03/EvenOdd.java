package chapter03;

import java.util.Scanner;

public class EvenOdd {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<3 ; i++) {
			System.out.print("정수를 입력하시오 : ");
			int userInput = input.nextInt();
			if(userInput%2==0) System.out.println("짝수입니다.");
			if(userInput%2==1) System.out.println("홀수입니다.");
		}
		for(int i=0 ; i<3 ; i++) {
			int randNum = (int) (Math.random()*(100-50+1)+50);
			if(randNum%2==0) System.out.println(randNum+"짝수입니다.");
			if(randNum%2==1) System.out.println(randNum+"홀수입니다.");
		}
		System.out.println("프로그램이 종료됩니다. :)");
	}
}
