package chapter05;

public class pro02Date {
	private static int[] yearMounthDay=new int[3];
	public static void DateSet(int year,int mounth, int day) {
		yearMounthDay[0]=year;
		yearMounthDay[1]=mounth;
		yearMounthDay[2]=day;
	}
	public static void DatePrint() {
		System.out.println(yearMounthDay[0]+"년 "+yearMounthDay[1]+"월 "+yearMounthDay[2]+"일");
	}
	public int[] getYearMonthDay() {
		return yearMounthDay;
	}
	public void setYearMonthDay(int[] yearMonthDay) {
		pro02Date.yearMounthDay = yearMonthDay; //왜 this로 하면 노란줄이 생기지?
	}
}
