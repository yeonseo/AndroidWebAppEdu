package chpter02;

import java.util.Scanner;

public class ToTest {
	public static void main(String[] args) {
		Scanner inputObject = new Scanner(System.in/*�����ϴ� ����(������ �Լ�)*/); //�Է��� �޴� ���
		
		YSMethod.toBinaryTest();

		CircleArea smallCrecle = new CircleArea();
		double area=smallCrecle.areaCircle();
		System.out.println(area);
		double volume=smallCrecle.volumCircle();
		System.out.println(volume);
		
		//Box smallBox = new Box();
		area=Box.areaBox();
		System.out.println(area);
		
//		System.out.print("�ֹι�ȣ�� �Է��ϼ��� : ");
//		long b = 0L;
//		b=inputObject.nextLong();
//		System.out.println(b);

	}

}
