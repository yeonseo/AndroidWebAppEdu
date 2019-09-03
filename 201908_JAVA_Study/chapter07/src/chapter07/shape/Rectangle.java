package chapter07.shape;

public class Rectangle extends Shape implements Movable, Drawable{
	private int width;	private int height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
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

	@Override
	public void move(int dx, int dy) {
		setShape(dx, dy);
		this.toString();
	}
	public void move() {
		int dx = (int) (Math.random()*(10-1)+1);
		int dy = (int) (Math.random()*(10-1)+1);
		setShape(dx, dy);
		this.toString();
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}
}
