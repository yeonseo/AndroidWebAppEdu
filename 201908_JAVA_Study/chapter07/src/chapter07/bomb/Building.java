package chapter07.bomb;

public class Building extends Bomb{

	public Building() {
		super(); //parents constructor call
	}
	
	@Override
	public void bomb() {
		System.out.println("Building bomb() function");
	}

	
}
