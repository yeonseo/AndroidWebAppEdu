package chpter02;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("이름?");
		String name=input.nextLine();
		
		System.out.println("나이?");
		int age=input.nextInt();
		System.out.println("안녕하세요 !"+name+"님!! :-) 당신의 나이는 "+age+"세 이군요!");
	}
}
