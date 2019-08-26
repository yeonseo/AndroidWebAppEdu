package chapter07.shape;

public class Rectangle extends Shape{
	private int width;
	private int height;
	public Rectangle() {
		//super();
		System.out.println("Rectangle()");
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		System.out.println("Rectangle()");
		this.width = width;
		this.height=height;
	}
	

	double calcArea() {
		return width * height;
	}
}
