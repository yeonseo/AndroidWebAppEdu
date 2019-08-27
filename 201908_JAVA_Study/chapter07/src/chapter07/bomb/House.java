package chapter07.bomb;

public class House extends Bomb{
	public House() {
		super(); //parents constructor call
	}
	
	@Override
	public void bomb() {
		System.out.println("House bomb() function");
	}

}
