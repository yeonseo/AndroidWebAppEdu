package chpter02;
import java.util.Scanner;
public class CircleArea {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		double radius = 5.0;
//		double area = 0.0;
//		final double PI=3.141592;
//		area = radius*radius*PI;
//		
//		System.out.print("반지름을 입력하시오 : ");
//		radius=input.nextDouble();
//		System.out.println("넓이 : "+ area+"cm2");
//	}
	double areaCircle() {
		final double PI=3.141592;
		Scanner inputObject = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		double a=inputObject.nextInt();
		double areaCircle = a*a*PI;
		return areaCircle;
	}
	double volumCircle() {
		final double PI=3.141592;
		Scanner inputObject = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		double a=inputObject.nextInt();
		double volumCircle = PI*4/3*a*a*a;
		return volumCircle;
	}
}
