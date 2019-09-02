package chapter09.problem.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarClass {
//	SimpleDateFormat formatDay = new SimpleDateFormat("yyyy-mm-dd");
//	Date today = new Date();
	
	Calendar cal = new GregorianCalendar(Locale.KOREA);
	private int year;
	private int month;
	private int date;
	
	public void yesterday() {
		this.year = cal.get(Calendar.YEAR);
		this.month = cal.get(Calendar.MONTH)+1;
		this.date = cal.get(Calendar.DATE);
		System.out.println(this.year+" "+this.month+" "+(this.date-1));
	}
	public void today() {
		this.year = cal.get(Calendar.YEAR);
		this.month = cal.get(Calendar.MONTH)+1;
		this.date = cal.get(Calendar.DATE);
		System.out.println(this.year+" "+this.month+" "+this.date);
	}
	public void customizeDay(int year, int month, int date) {
		this.year = cal.get(Calendar.YEAR)-year;
		this.month = cal.get(Calendar.MONTH)+1-month;
		this.date = cal.get(Calendar.DATE)-date;
		System.out.println(this.year+" "+this.month+" "+this.date);
	}
}
