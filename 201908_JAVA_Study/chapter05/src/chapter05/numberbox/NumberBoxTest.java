package chapter05.numberbox;

import java.util.Scanner;

public class NumberBoxTest {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		NumberBox num = new NumberBox(10, 1.2345f);
		num.printValue();
		System.out.println("계산 결과 : "+num.multiValue());
		
		num.setFValue(5.462f);
		num.setIValue(20);
		num.printValue();
		System.out.println("계산 결과 : "+num.multiValue());
	}
}