package chapter07.shape;

public class Circle extends Shape implements Movable, Drawable{
	private int radius;
	
	@Override
	public void move(int dx, int dy) {
		dx = (int) (Math.random()*(10-1)+1);
		dy = (int) (Math.random()*(10-1)+1);
		setShape(dx, dy);
	}
	public void draw() {
		System.out.println("circle");
	}
}
