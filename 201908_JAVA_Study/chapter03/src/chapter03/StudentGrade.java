package chapter03;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�л� �̸� : ");
		String name = input.nextLine();
		System.out.print("���� : ");
		int grade = input.nextInt();
		
//		switch (grade/10) {
//		case 10: case 9: System.out.println(name+"�л��� " +grade +" : A �Դϴ� "); break;
//		case 8: System.out.println(name+"�л��� " +grade +" : B �Դϴ� ");break;
//		case 7: System.out.println(name+"�л��� " +grade +" : C �Դϴ� ");break;
//		case 6: System.out.println(name+"�л��� " +grade +" : D �Դϴ� ");break;
//		default : System.out.println(name+"�л��� " +grade +" : F �Դϴ� \n �й�..... ����....");break;
//		}
		
		if (grade >90) System.out.println(name+"�л��� " +grade +" : A �Դϴ� ");
		else if (grade <=90 && grade >80) System.out.println(name+"�л��� " +grade +" : B �Դϴ� ");
		else if (grade <=80 && grade >70) System.out.println(name+"�л��� " +grade +" : C �Դϴ� ");
		else if (grade <=70 && grade >60) System.out.println(name+"�л��� " +grade +" : D �Դϴ� ");
		else System.out.println(name+"�л��� " +grade +" : F �Դϴ� \n �к�....����....");
	}
}
