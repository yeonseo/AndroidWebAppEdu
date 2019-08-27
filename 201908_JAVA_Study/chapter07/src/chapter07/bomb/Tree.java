package chapter07.bomb;

public class Tree extends Bomb{
	public Tree() {
		super(); //parents constructor call
	}
	
	@Override
	public void bomb() {
		System.out.println("Tree bomb() function");
	}

}
