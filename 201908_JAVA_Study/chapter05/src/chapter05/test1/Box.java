package chapter05.test1;

public class Box {
	public int width;
	public int length;
	public int height;
	
	public Box() {
		this.height=0;
		this.length=0;
		this.width=0;
	}
	
	public void setWidth(int width/*this가 생략되어있음*/) {
		this.width=width; //this는 이 클래스 안의 변수를 사용하겠다.
	}
	public void setLength(int length) {
		this.length=length;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}
	public int getLength() {
		return this.length;
	}
	public int boxVolume() {
		return this.height*this.length*this.width;
	}
}
