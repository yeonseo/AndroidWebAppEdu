package chapter07.shapereturn;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}

	double area() {
		return (double)width * height*0.5;
	}
	void draw() {
		System.out.println("("+this.getX()+","+this.getY()+")"+" at "+"("+width+")"+height);
	}
	
}
