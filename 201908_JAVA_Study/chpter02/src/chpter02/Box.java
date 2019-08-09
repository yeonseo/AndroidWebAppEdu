package chpter02;

import java.util.Scanner;

public class Box {
//	public static void main(String[] args) {
//		double witdh=0.0;
//		double height=0.0;
//		double area=0.0;
//		double parimeter=0.0;
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("사각형의 가로를 입력하시오 : ");
//		witdh=input.nextDouble();
//		System.out.print("사각형의 세로를 입력하시오 : ");
//		height=input.nextDouble();
//		area = witdh*height;
//		parimeter=(witdh+height)*2;
//		System.out.println("넓이 : "+ area+"cm2");
//		System.out.println("둘레 : "+ parimeter +"cm");
//	}
	public static double areaBox() {
		Scanner inputObject = new Scanner(System.in/*셋팅하는 조건(생성자 함수)*/);
		System.out.print("가로 넓이 입력 : ");
		double a=inputObject.nextInt();
		System.out.print("세로 넓이 입력 : ");
		double b=inputObject.nextInt();
		double area = a*b;
		return area;
	} //정적이 아니면 객체로 불러야만 사용할 수 있다. static으로 선언하면 데이터영역에 올림!
	//정적으로 선언을 해야 바이트 코드가 JVM에 올리는 순간 정적함수를 메모리에 올리고, 
	//main 함수가 사용할 수 있는 정적 변수와 정적 함수로 된다.
	double parimeterBox(double a, double b) {
		double parimeter=(a+b)*2;
		return parimeter;
	}

}
