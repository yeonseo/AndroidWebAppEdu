package chapter07.shape;

public class Triangle extends Shape implements Movable, Drawable{
	private int base, height;
	public void draw() {
		System.out.println("Triangle draw");
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
		return "Triangle [base=" + base + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}
	
}
