package chapter05.problem;

public class Rectangle {
	private int width; private int height; private int area; private int perimeter;
	public Rectangle() {
		this.width=0; 	this.height=0; this.area=0;
	}
	public Rectangle(int age, int rollno) {
		this.width=age; this.height=rollno;	this.area=0;
	}
	public int area() {
		this.area=this.width*this.height;
		return this.area;
	}
	public int perimeter() {
		this.perimeter=(this.width+this.height)*2;
		return this.perimeter;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area +
				", perimeter=" + perimeter + "]";
	}
	public int getWidth() {	return width;}
	public void setWidth(int width) { this.width = width;}
	public int getHeight() { return height;}
	public void setHeight(int height) { this.height = height;}
	public int getArea() { return area;}
	public void setArea(int area) {	this.area = area;}
}