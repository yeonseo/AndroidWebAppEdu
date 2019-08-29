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
	public void setCylinder(double radius, double height, String color) {
		super.setCircle(radius, color);
		this.height = height;
	}
	public void getHeight(double height) {
		this.height=height;
	}
	public double getVolume() {
		return height*this.getRadius()*2.0*3.14;
	}
}
