package chapter09.problem.rectangle;

public class Rectangle implements GraphicsObject {
	private int width;
	private int length;
	@Override
	public int getArea() {
		return this.length*this.width;
	}
	@Override
	public void draw() {
		System.out.println(this.width+","+this.length+" : "+this.getArea());
	}
	public void setDimensions(int width, int length) {
		this.width = width;
		this.length = length;
	}

}
