package chapter05.test;

public class Car {
	private int gear;
	private int speed;
	private String color;
	
	public Car() {
		this.gear=0;
		this.speed=0;
		this.color=null;
	}
	public Car(int speed, int gear, String color) {
		this.gear=1;
		this.speed=10;
		this.color=color;
	}
	
	public void changeGear(int gear) {
		this.gear=gear;
	}
	public int upSpeed() {
		return ++this.speed;
	}
	public int downSpeed() {
		return --this.speed;
	}
	public void setGear(int gear) {
		this.gear=gear;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getGear() {
		return this.gear;
	}
	public int getSpeed() {
		return this.speed;
	}
	public String getColor() {
		return this.color;
	}

}
