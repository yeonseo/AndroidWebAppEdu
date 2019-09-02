package chapter09.interfacetest.trancport;

public class Car implements Metro{

	@Override
	public void start() {
		System.out.println("Car run");
	}

	@Override
	public void stop() {
		System.out.println("Car stop");		
	}

	@Override
	public void setSpeed() {
		System.out.println("Car Speed");		
	}

	@Override
	public void turn() {
		System.out.println("Car turn");	
	}

}
