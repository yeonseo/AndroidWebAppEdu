package chpter02;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("�̸�?");
		String name=input.nextLine();
		
		System.out.println("����?");
		int age=input.nextInt();
		System.out.println("�ȳ��ϼ��� !"+name+"��!! :-) ����� ���̴� "+age+"�� �̱���!");
	}
}