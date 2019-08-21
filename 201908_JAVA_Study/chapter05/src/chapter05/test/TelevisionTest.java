package chapter05.test;

public class TelevisionTest {
	public static void main(String[] args) {
		Telelvision telelvision=new Telelvision();
		telelvision.setChannel(20);
		telelvision.setOnOff(true);
		telelvision.setVolume(40);
		System.out.println("telelvision.channel"+telelvision.getChannel());
		System.out.println("telelvision.volume"+telelvision.getVolume());
		System.out.println("telelvision.onOff"+telelvision.getOnOff());
		
		//That's not good idea.
		
	}
}
