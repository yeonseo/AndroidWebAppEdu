package chapter07.trancport;

public class Subway implements Metro{
	@Override
	public void start() {
		System.out.println("Subway run");
	}

	@Override
	public void stop() {
		System.out.println("Subway stop");		
	}

	@Override
	public void setSpeed() {
		System.out.println("Subway Speed");		
	}

	@Override
	public void turn() {
		System.out.println("Subway turn");	
	}
}
