package chapter07.bombTest;

public class BombTest {

	public static void main(String[] args) {
		//1.객체 배열을 만든다.4개 객체 배열 요소
		Bomb[] bomb = {new House(), new Building(), new Tree(), new Car()};
		//2. 반복문을 이용해서 각 객체의 bomb를 출력한다.
		
		for(Bomb i : bomb) {
			i.bomb();
		}
		//3. 반복문을 이용해서 각 객체의 Sbomb를 부른다. 출력한다. 하향형변

		for(int i = 0 ; i < bomb.length ; i++) {
			if(bomb[i] instanceof House) {
				((House)bomb[i]).Sbomb();
			}
			if(bomb[i] instanceof Building) {
				((Building)bomb[i]).Sbomb();
			}
			if(bomb[i] instanceof Tree) {
				((Tree)bomb[i]).Sbomb();
			}	
			if(bomb[i] instanceof Car) {
				((Car)bomb[i]).Sbomb();
			}	
		}
		
		for(Bomb i : bomb) {
			if(i instanceof House) {
				((House)i).Sbomb();
			}
			if(i instanceof Building) {
				((Building)i).Sbomb();
			}
			if(i instanceof Tree) {
				((Tree)i).Sbomb();
			}	
			if(i instanceof Car) {
				((Car)i).Sbomb();
			}
		}
	}

}
