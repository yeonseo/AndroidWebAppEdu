package chapter06;

public class Dice {
	private int diceNum;
	
	void roll() {
		this.diceNum=(int) (Math.random()*(6-1+1)+1);
	}
	int getRoll() {
		return this.diceNum;
	}
}

