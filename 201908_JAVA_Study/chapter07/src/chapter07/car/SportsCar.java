package chapter07.car;

public class SportsCar extends Car {
	int dspeed;
	public SportsCar(int speed) {
		super(speed);
		System.out.println("sportsCat constructor");
	}
	private boolean turbo;
	boolean bturbo;
	public void setTurbo(boolean turbo) {
		this.bturbo = turbo;
		this.dspeed=10;
		super.dspeed=11; //실무에선 구분을 잘 하지 않는다.
		Car.myCar=20;	//this.myCar=22; super.myCar=24;
	}
}
