package chapter09.interfacetest.shape;

public class Triangle {
	private double base;
	private double height;
	public double calcArea() {
		return this.base*this.height;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
}
