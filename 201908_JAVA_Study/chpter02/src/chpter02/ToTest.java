package chpter02;

import java.util.Scanner;

public class ToTest {
	public static void main(String[] args) {
		Scanner inputObject = new Scanner(System.in/*셋팅하는 조건(생성자 함수)*/); //입력을 받는 기계
		
		YSMethod.toBinaryTest();

		CircleArea smallCrecle = new CircleArea();
		double area=smallCrecle.areaCircle();
		System.out.println(area);
		double volume=smallCrecle.volumCircle();
		System.out.println(volume);
		
		//Box smallBox = new Box();
		area=Box.areaBox();
		System.out.println(area);
		
//		System.out.print("주민번호를 입력하세요 : ");
//		long b = 0L;
//		b=inputObject.nextLong();
//		System.out.println(b);

	}

}
