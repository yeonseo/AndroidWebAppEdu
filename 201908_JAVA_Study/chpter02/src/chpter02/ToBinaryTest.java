package chpter02;

import java.util.Scanner;

public class ToBinaryTest {
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
	}

}
