package chapter09.anonymouse;

public class AnonyTest {

	public static void main(String[] args) {
		/*make A class*/
		B b = new A();
		b.turnOn();
		//b.turnOff();
		
		/*anonymous*/
		B b1 = new B() {
			@Override
			public void turnOn() {
				System.out.println("on!!!!");
			}

			//@Override
			//public void turnOff() {
			//	System.out.println("off!!!");
			//}
		};
		b1.turnOn();
		//b1.turnOff();
		
		/*lambda*/
		B b2 = ()->{
			System.out.println("on!!!");
		};
		b2.turnOn();
	}

}
