package chapter03;

import java.util.Scanner;

public class EvenOdd {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<3 ; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			int userInput = input.nextInt();
			if(userInput%2==0) System.out.println("¦���Դϴ�.");
			if(userInput%2==1) System.out.println("Ȧ���Դϴ�.");
		}
		for(int i=0 ; i<3 ; i++) {
			int randNum = (int) (Math.random()*(100-50+1)+50);
			if(randNum%2==0) System.out.println(randNum+"¦���Դϴ�.");
			if(randNum%2==1) System.out.println(randNum+"Ȧ���Դϴ�.");
		}
		System.out.println("���α׷��� ����˴ϴ�. :)");
	}
}
