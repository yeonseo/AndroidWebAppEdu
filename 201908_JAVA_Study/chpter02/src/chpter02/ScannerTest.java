package chpter02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//1. ������ �Է¹޴� ���
		//2. Scanner ��ü�� �����
		//3. ���ڿ�, ���ڴܾ�, ����, �Ǽ�, �ο�
		 
		Scanner input = new Scanner(System.in);
		
		String s2="���;ƾƾƾ�";
		
		//System.out.println(s1+"\n"+s2);
		System.out.println("�̸�?");
		String s1=input.nextLine();
		System.out.println("����� �̸��� "+s1+"�Դϴ�");
		
		System.out.println("����?");
		int age=input.nextInt();
		System.out.println("����� ���̴� "+age+"�� �Դϴ�");
	}
}