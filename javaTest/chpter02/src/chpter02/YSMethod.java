package chpter02;

import java.util.Scanner;

public class YSMethod {
	public static void main(String[] arge) {
		orange_boxing();
		mile_killo();
		charge_print();
		}
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
	public static void toBinaryTest() {
		Scanner inputObject = new Scanner(System.in/*셋팅하는 조건(생성자 함수)*/); //입력을 받는 기계
		System.out.print("이진법으로 바꿀 정수값을 입력 요망 : ");
		int number=inputObject.nextInt();
		String strValue=Integer.toBinaryString(number);
		while(strValue.length()<32) {
			strValue="0"+strValue;
		}
		System.out.println(number+"값을 이진법으로 하면"+strValue+"이고, 길이는 "+strValue.length());
	}
	
	static void orange_boxing(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("오렌지의 개수를 입력하시오 : ");
		int orange = input.nextInt();
		System.out.println(orange/10+"개의 박스가 필요하고 "
				+orange%10+"개의 오렌지가 남습니다.");	
	}
	
	static void mile_killo(){
		Scanner input = new Scanner(System.in);
		double mile, km;
		final double changeMileToKm = 1.609;
		System.out.print("마일을 입력하시오 : ");
		mile=input.nextDouble();
		km=mile*changeMileToKm;
		System.out.println("입력하신 "+mile+"마일은 "+km+"km입니다.");
	}
	
	static void charge_print() {
		Scanner input = new Scanner(System.in);
		int payMoney, goodsPrice;
		System.out.print("받은 돈 : ");
		payMoney=input.nextInt();
		System.out.print("상품가격 : ");
		goodsPrice=input.nextInt();
		
		int addedTax=(int)(goodsPrice*0.1);
		System.out.println("부가세 : "+addedTax);
		if(payMoney>=goodsPrice) 	System.out.println("잔돈 : "+ (payMoney-goodsPrice) );
		if(payMoney<goodsPrice) 	System.out.println(goodsPrice-payMoney+"원이 모자릅니다. ");
	}
	
	double parimeterBox(double a, double b) {
		double parimeter=(a+b)*2;
		return parimeter;
	}
	
	public static void Temperature() {
		double ctemp;
		double ftemp;
		Scanner inputObject = new Scanner(System.in);
		System.out.print("화씨 온도 : ");
		ftemp=inputObject.nextDouble();
		ctemp=(5.0/9.0)*(ftemp-32.0);
		System.out.println("화씨 온도 : "+ftemp+" 섭씨온도 : "+ctemp);
	}
}
