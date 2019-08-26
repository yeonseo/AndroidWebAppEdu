package chapter07.shapereturn;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.setX(5);
		r1.setY(10);
		r1.setWidth(20);
		r1.setHeight(10);
		
		r2.setX(3);
		r2.setY(7);
		r2.setWidth(10);
		r2.setHeight(15);
		
		r1.print();
		r1.draw();
		r2.print();
		r2.draw();
	}

}
