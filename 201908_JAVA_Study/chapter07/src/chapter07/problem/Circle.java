package chapter07.problem;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		this.color=null;
		this.radius=0.0;
	}
	public Circle(double radius, String color) {
		this.color=color;
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	
}