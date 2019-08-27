package chapter07.bomb;

public class BombTest {

	public static void main(String[] args) {
		Bomb[] bomb = {new Building(), new House(), new Tree()};
		
		for(Bomb i : bomb) {
			i.bomb();

			if(i instanceof Building) {
				((Building)i).bomb();
			}
			if(i instanceof Tree) {
				((Tree)i).bomb();
			}
			if(i instanceof House) {
				((House)i).bomb();
			}
		}	
//		boolean obj = true;
//		for(Bomb i : bomb) {
//			obj = bomb[i] instenceof i;
//		}
		

	}

}
