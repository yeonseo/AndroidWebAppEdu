package chapter03;

import java.util.Scanner;

public class Bonus {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("실적을 입력하세요 : ");
		int goal = input.nextInt();
		int bonus = (int)((goal-1000)*0.1);
		if(goal > 1000) {
			System.out.println("실적 달성!");
			System.out.println("보너스 : " + bonus);			
		} else if (goal < 1000) {
			System.out.println(goal+"... 흠... 분발하세요!!!!!");
		} else if (goal == 1000) {
			System.out.println("본전이시군여... 흠흠... o(*'▽'*)/☆ ");
			System.out.println("다음달 지켜보겠어요...");
		}
			
		
	}
}
