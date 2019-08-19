package chapter05.test1;

public class TelevisionTest {

	public static void main(String[] args) {
		Television television=new Television();
		television.setChannel(20);
		television.setVolume(20);
		television.setOnOff(true);
		System.out.println("television.setChannel : "+television.getChannel());
		System.out.println("television.setVolume : "+television.getVolume());
		System.out.println("television.setOnOff : "+television.getOnOff());
		
		
		
	}

}
