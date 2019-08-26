package chapter07.problem;

public class Point {
	private int x;	private int y;
	
	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	public void setPoint(int x, int y) {
		this.x=x; this.y=y;
	}
	public void printPoint() {
		System.out.println("x : "+this.x+" y : "+this.y); 
	}
}
