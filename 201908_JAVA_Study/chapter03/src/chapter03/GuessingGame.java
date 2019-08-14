package chapter03;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		
		guessGame();
	}
	
	public static void guessGame() {
		int gameNum=randNum();
		int user=0;
		int count=0;
		while(user!=gameNum) {
			System.out.print("정수를 입력하세요 : ");
			user=inputNum();
			count++;
		}
		System.out.println("정답입니다! 축하드립니다!" + count);
	}
	public static int randNum() {
		int rand=0;
		rand = (int) (Math.random()*(100-1+1)+1);
		return rand;
	}
	public static int inputNum() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
}
