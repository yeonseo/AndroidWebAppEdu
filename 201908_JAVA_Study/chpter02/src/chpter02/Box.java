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
//		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
//		witdh=input.nextDouble();
//		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
//		height=input.nextDouble();
//		area = witdh*height;
//		parimeter=(witdh+height)*2;
//		System.out.println("���� : "+ area+"cm2");
//		System.out.println("�ѷ� : "+ parimeter +"cm");
//	}
	public static double areaBox() {
		Scanner inputObject = new Scanner(System.in/*�����ϴ� ����(������ �Լ�)*/);
		System.out.print("���� ���� �Է� : ");
		double a=inputObject.nextInt();
		System.out.print("���� ���� �Է� : ");
		double b=inputObject.nextInt();
		double area = a*b;
		return area;
	} //������ �ƴϸ� ��ü�� �ҷ��߸� ����� �� �ִ�. static���� �����ϸ� �����Ϳ����� �ø�!
	//�������� ������ �ؾ� ����Ʈ �ڵ尡 JVM�� �ø��� ���� �����Լ��� �޸𸮿� �ø���, 
	//main �Լ��� ����� �� �ִ� ���� ������ ���� �Լ��� �ȴ�.
	double parimeterBox(double a, double b) {
		double parimeter=(a+b)*2;
		return parimeter;
	}

}
