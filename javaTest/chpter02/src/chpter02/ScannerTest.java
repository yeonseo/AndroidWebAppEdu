package chpter02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		//1. 문장을 입력받는 방법
		//2. Scanner 객체를 만든다
		//3. 문자열, 문자단어, 변수, 실수, 부울
		 
		Scanner input = new Scanner(System.in);
		
		String s2="오와아아아아";
		
		//System.out.println(s1+"\n"+s2);
		System.out.println("이름?");
		String s1=input.nextLine();
		System.out.println("당신의 이름은 "+s1+"입니다");
		
		System.out.println("나이?");
		int age=input.nextInt();
		System.out.println("당신의 나이는 "+age+"세 입니다");
	}
}