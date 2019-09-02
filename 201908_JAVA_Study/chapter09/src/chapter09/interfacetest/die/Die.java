package chapter09.interfacetest.die;

public class Die {
	private int getValue;
	
	public Die() {
		this.getValue=0;
	}
	public void setValue(int getValue) {
		this.getValue=getValue;
	}
	public int getValue() {
		return this.getValue;
	}
	public int roll() {
		this.getValue=(int) (Math.random()*(6-1+1)+1);
		return this.getValue;
	}
}
