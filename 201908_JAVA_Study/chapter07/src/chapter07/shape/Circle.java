package chapter07.shape;

public class Circle extends Shape implements Movable, Drawable{
	private int radius;
	
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
	public void draw() {
		System.out.println("circle");
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
}
