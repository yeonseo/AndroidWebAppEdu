package chapter07.shape;

public class Shape {
	public int x;
	public int y;
	public void draw() {
		System.out.println("Shape Draw");
	}
	public Shape() {
		System.out.println("Shape()");
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
		//System.out.println("Shape()");
	}
	
}
