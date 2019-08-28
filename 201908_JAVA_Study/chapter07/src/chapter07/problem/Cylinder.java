package chapter07.problem;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder () {
		super();
		this.height=0.0;
	}
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
}
