package chapter09.problem.contrallable;

public class ControllableTest {

	public static void main(String[] args) {
		Controllable controll = new Controllable() {
			@Override
			public void play() { System.out.println("System : play"); }
			@Override
			public void stop() { System.out.println("System : stop"); }
		};
		controll.play();
		controll.stop();
	}
}
