package chapter06;

public class Circle {
	private int cx;	private int cy;
	private double cr; private double carea;
	private final double PI = 3.14;
	
	public Circle(int x, int y, double r) {
		this.cx=x; this.cy=y; this.cr=r;
	}
	
	double area() {
		this.carea=this.cr*this.cr*this.PI;
		return this.carea;
	}
}
