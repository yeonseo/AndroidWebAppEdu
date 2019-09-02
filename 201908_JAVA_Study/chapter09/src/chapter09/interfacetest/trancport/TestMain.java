package chapter09.interfacetest.trancport;

public class TestMain {

	public static void main(String[] args) {
		Metro[] m = {new Bus(), new Car(), new Subway()};
		for(Metro i : m) {
			i.start();
			i.stop();
			i.turn();
			i.setSpeed();
		}
		
		Bus b = new Bus();
		Metro m2 = b;
		b = (Bus) m2;
		
		//Bus bus = new Metro();
	}

}
