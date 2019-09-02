package chapter09.interfacetest.die;

public class Game {

	public static void main(String[] args) {
		Die d = new Die();
		System.out.println(d.roll());
		
		RPC game = new RPC();
		game.rollRPC();
	}

}
