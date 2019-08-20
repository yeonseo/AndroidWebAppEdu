package chapter05.problem;

public class Date2 {
private int[] yearMounthDay=new int[3];
	
	public Date2() {
		this.yearMounthDay[0]=1991;
		this.yearMounthDay[1]=0;
		this.yearMounthDay[2]=0;
	}
	public Date2(int year, int mounth, int day) {
		this.yearMounthDay[0]=year;
		this.yearMounthDay[1]=mounth;
		this.yearMounthDay[2]=day;
	}	
	public void setDate(int year, int mounth, int day) {
		this.yearMounthDay[0]=year;
		this.yearMounthDay[1]=mounth;
		this.yearMounthDay[2]=day;
	}
	public void printDate1() {
		System.out.println("날짜 : "+this.yearMounthDay[0]+"년 "+
					this.yearMounthDay[1]+"월 "+this.yearMounthDay[2]+"일");
	}
	public void printDate2() {
		String mounth = null;
		switch(this.yearMounthDay[1]) {
		case 1:mounth="January";break;
		case 2:mounth="Feburary";break;
		case 3:mounth="March";break;
		case 4:mounth="April";break;
		case 5:mounth="May";break;
		case 6:mounth="June";break;
		case 7:mounth="July";break;
		case 8:mounth="August";break;
		case 9:mounth="September";break;
		case 10:mounth="October";break;
		case 11:mounth="November";break;
		case 12:mounth="December";break;
		}
		System.out.println(mounth+" "+this.yearMounthDay[2]+", "+this.yearMounthDay[0]);
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
	
	
}
