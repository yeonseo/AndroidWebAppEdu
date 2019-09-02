package chapter09.interfacetest.shape;

public class Rectangle extends Shape{
	private double length;
	private double width;
	public double calcArea() {
		return this.width*this.length;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}	
}
