package chapter03;
import java.time.LocalDateTime;
import java.time.Month;
public class TimerTest {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		int year = localDateTime.getYear();
		Month month = localDateTime.getMonth();
		int date = localDateTime.getDayOfMonth();
		int hour = localDateTime.getHour();
		int min = localDateTime.getMinute();
		int second = localDateTime.getSecond();
		System.out.println("현재 시간 : "+ year+"년"+month+"월"+date+"일 "+hour+":"+min+":"+second);
	}

}
