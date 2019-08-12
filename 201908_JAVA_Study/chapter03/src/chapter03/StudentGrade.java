package chapter03;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("학생 이름 : ");
		String name = input.nextLine();
		System.out.print("성적 : ");
		int grade = input.nextInt();
		
//		switch (grade/10) {
//		case 10: case 9: System.out.println(name+"학생은 " +grade +" : A 입니다 "); break;
//		case 8: System.out.println(name+"학생은 " +grade +" : B 입니다 ");break;
//		case 7: System.out.println(name+"학생은 " +grade +" : C 입니다 ");break;
//		case 6: System.out.println(name+"학생은 " +grade +" : D 입니다 ");break;
//		default : System.out.println(name+"학생은 " +grade +" : F 입니다 \n 분발..... 하즈....");break;
//		}
		
		if (grade >90) System.out.println(name+"학생은 " +grade +" : A 입니다 ");
		else if (grade <=90 && grade >80) System.out.println(name+"학생은 " +grade +" : B 입니다 ");
		else if (grade <=80 && grade >70) System.out.println(name+"학생은 " +grade +" : C 입니다 ");
		else if (grade <=70 && grade >60) System.out.println(name+"학생은 " +grade +" : D 입니다 ");
		else System.out.println(name+"학생은 " +grade +" : F 입니다 \n 분블....흐즈....");
	}
}
