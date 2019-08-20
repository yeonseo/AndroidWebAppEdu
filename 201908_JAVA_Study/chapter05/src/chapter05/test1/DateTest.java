package chapter05.test1;

import java.util.Scanner;

public class DateTest {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	Date date = new Date(2019,8,10);
	date.printDate();
	System.out.println(date.getYear()+"년"+date.getMounth()+"월"
						+date.getDate()+"일");
	date.setDate(2019, 10, 31);
	date.printDate();
	}
	
}





















//public static void main(String[] args) {
//	Date num = new Date(2019,10,29);
//	num.DatePrint();
//	num.setYearMonthDay(2019,8,20);
//	num.DatePrint();
//}



















//		pro03Rectangle myRect = new pro03Rectangle();
//		myRect.width = 10;
//		myRect.height = 20;
//		System.out.println("면적은 " + myRect.area());
//		String s = "ABCDEFG";
//		s.toLowerCase(); System.out.println(s);
//		System.out.println("2 + 3 = " + 2 + 3);