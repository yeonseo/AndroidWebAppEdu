package chapter03;

import java.util.Scanner;

public class Bonus {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int goal = input.nextInt();
		int bonus = (int)((goal-1000)*0.1);
		if(goal > 1000) {
			System.out.println("���� �޼�!");
			System.out.println("���ʽ� : " + bonus);			
		} else if (goal < 1000) {
			System.out.println(goal+"... ��... �й��ϼ���!!!!!");
		} else if (goal == 1000) {
			System.out.println("�����̽ñ���... ����... o(*'��'*)/�� ");
			System.out.println("������ ���Ѻ��ھ��...");
		}
			
		
	}
}
