package chapter03;

import java.util.Scanner;

public class TwoFactor {
	public static void main(String[] agrs) {
		
		
		System.out.println("ù��° ������ �Է��ϼ���.");
		int numOne = inputValue();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		int numTwo = inputValue();
		int z;
		if(numOne<numTwo) {
			z = numOne; numOne= numTwo;numTwo=z;
		}
		
		while(true) {
			if(numTwo==0) {
				System.out.println("�ִ� ����� : "+numOne);
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
			System.out.print("1~100 ������ ������ �Է��ϼ��� : ");
			num = input.nextInt();
		}while(num<0||num>100);
		return num;
	}
}
