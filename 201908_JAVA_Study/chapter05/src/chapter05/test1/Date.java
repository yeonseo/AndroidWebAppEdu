package chapter05.test1;

public class Date {
	private int[] yearMounthDay=new int[3];
	
	public Date() {
		this.yearMounthDay[0]=1991;
		this.yearMounthDay[1]=0;
		this.yearMounthDay[2]=0;
	}
	public Date(int year, int mounth, int day) {
		this.yearMounthDay[0]=year;
		this.yearMounthDay[1]=mounth;
		this.yearMounthDay[2]=day;
	}
	public void setDate(int year, int mounth, int day) {
		this.yearMounthDay[0]=year;
		this.yearMounthDay[1]=mounth;
		this.yearMounthDay[2]=day;
	}
	public int getYear() {
		return this.yearMounthDay[0];
	}
	public int getMounth() {
		return this.yearMounthDay[1];
	}
	public int getDate() {
		return this.yearMounthDay[2];
	}
	
	public void printDate() {
		System.out.println("날짜 : "+this.yearMounthDay[0]+"년 "+
					this.yearMounthDay[1]+"월 "+this.yearMounthDay[2]+"일");
	}
}



//public Date(int year,int mounth, int day) {
//	this.yearMounthDay[0]=year;
//	this.yearMounthDay[1]=mounth;
//	this.yearMounthDay[2]=day;
//}
//public void DatePrint() {
//	System.out.println(yearMounthDay[0]+"년 "+yearMounthDay[1]+"월 "+yearMounthDay[2]+"일");
//}
//public int[] getYearMonthDay() {
//	return yearMounthDay;
//}
//public void setYearMonthDay(int year,int mounth, int day) {
//	this.yearMounthDay[0]=year;
//	this.yearMounthDay[1]=mounth;
//	this.yearMounthDay[2]=day;
//}
