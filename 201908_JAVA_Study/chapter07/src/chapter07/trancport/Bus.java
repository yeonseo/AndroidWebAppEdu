package chapter07.trancport;

public class Bus implements Metro{
	@Override
	public void start() {
		System.out.println("Bus run");
	}

	@Override
	public void stop() {
		System.out.println("Bus stop");		
	}

	@Override
	public void setSpeed() {
		System.out.println("Bus Speed");		
	}

	@Override
	public void turn() {
		System.out.println("Bus turn");	
	}
}
