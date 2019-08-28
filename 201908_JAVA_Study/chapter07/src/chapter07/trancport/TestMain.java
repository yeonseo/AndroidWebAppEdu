package chapter07.trancport;

public class TestMain {

	public static void main(String[] args) {
		Metro[] m = {new Bus(), new Car(), new Subway()};
		for(Metro i : m) {
			i.start();
			i.stop();
			i.turn();
			i.setSpeed();
		}
	}

}
