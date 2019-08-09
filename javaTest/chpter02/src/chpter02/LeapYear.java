package chpter02;

public class LeapYear {
	public static void main(String[] args) {
		int year=2019;
		boolean bool;
		
		bool = (year % 4 ==0);
		System.out.println(year+"년은 윤년?! 결과 : "+bool);
	}
}
