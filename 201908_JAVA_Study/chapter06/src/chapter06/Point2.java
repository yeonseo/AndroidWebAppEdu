package chapter06;

public class Point2 {
	private int x;	private int y;
	
	public Point2(int x, int y) {
		this.x=x; this.y=y;
	}
	public void setPoint(int x, int y) {
		this.x=x; this.y=y;
	}
	public void printPoint() {
		System.out.println("x : "+this.x+" y : "+this.y); 
	}
}
