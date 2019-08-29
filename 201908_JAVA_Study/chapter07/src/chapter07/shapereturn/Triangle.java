package chapter07.shapereturn;

public class Triangle extends Shape{
	private int base, height;
	
	public Triangle(int x, int y,int base, int height) {
		super();
		this.base=base;
		this.height=height;
	}
	public void draw() {
		System.out.println("Triangle draw");
	}
	public int length(int a, int b, int c) {
		return a+b+c;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
	
}
