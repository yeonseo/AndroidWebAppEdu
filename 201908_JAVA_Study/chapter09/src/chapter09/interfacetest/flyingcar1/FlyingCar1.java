package chapter09.interfacetest.flyingcar1;

public class FlyingCar1 implements Drivable, Flyable{

	public static void main(String[] args) {
		FlyingCar1 obj = new FlyingCar1();
		obj.drive();
		obj.fly();
	}

	@Override
	public void fly() {
		System.out.println("flying!");
	}

	@Override
	public void drive() {
		System.out.println("driving!");
	}

}
