package chpter02;

import java.util.Scanner;

public class YSMethod {
	public static void main(String[] arge) {
		orange_boxing();
		mile_killo();
		charge_print();
		}
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
	public static void toBinaryTest() {
		Scanner inputObject = new Scanner(System.in/*�����ϴ� ����(������ �Լ�)*/); //�Է��� �޴� ���
		System.out.print("���������� �ٲ� �������� �Է� ��� : ");
		int number=inputObject.nextInt();
		String strValue=Integer.toBinaryString(number);
		while(strValue.length()<32) {
			strValue="0"+strValue;
		}
		System.out.println(number+"���� ���������� �ϸ�"+strValue+"�̰�, ���̴� "+strValue.length());
	}
	
	static void orange_boxing(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� ������ �Է��Ͻÿ� : ");
		int orange = input.nextInt();
		System.out.println(orange/10+"���� �ڽ��� �ʿ��ϰ� "
				+orange%10+"���� �������� �����ϴ�.");	
	}
	
	static void mile_killo(){
		Scanner input = new Scanner(System.in);
		double mile, km;
		final double changeMileToKm = 1.609;
		System.out.print("������ �Է��Ͻÿ� : ");
		mile=input.nextDouble();
		km=mile*changeMileToKm;
		System.out.println("�Է��Ͻ� "+mile+"������ "+km+"km�Դϴ�.");
	}
	
	static void charge_print() {
		Scanner input = new Scanner(System.in);
		int payMoney, goodsPrice;
		System.out.print("���� �� : ");
		payMoney=input.nextInt();
		System.out.print("��ǰ���� : ");
		goodsPrice=input.nextInt();
		
		int addedTax=(int)(goodsPrice*0.1);
		System.out.println("�ΰ��� : "+addedTax);
		if(payMoney>=goodsPrice) 	System.out.println("�ܵ� : "+ (payMoney-goodsPrice) );
		if(payMoney<goodsPrice) 	System.out.println(goodsPrice-payMoney+"���� ���ڸ��ϴ�. ");
	}
	
	double parimeterBox(double a, double b) {
		double parimeter=(a+b)*2;
		return parimeter;
	}
	
	public static void Temperature() {
		double ctemp;
		double ftemp;
		Scanner inputObject = new Scanner(System.in);
		System.out.print("ȭ�� �µ� : ");
		ftemp=inputObject.nextDouble();
		ctemp=(5.0/9.0)*(ftemp-32.0);
		System.out.println("ȭ�� �µ� : "+ftemp+" �����µ� : "+ctemp);
	}
}