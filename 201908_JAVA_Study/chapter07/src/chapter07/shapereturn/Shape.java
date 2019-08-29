package chapter07.shapereturn;

public class Shape {
	private int x;
	private int y;
	
	public int getX() { return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	void print() {
		System.out.println(" X  : "+x+" Y : "+y);
	}
	public int length() {
		return 0;
	}
}
