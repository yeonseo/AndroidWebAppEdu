package chapter06.circle;

public class CircleTest {

	public static void main(String[] args) {
		Point p = new Point(10,10);
		Circle c = new Circle(10,p);
		System.out.println(c);
	}

}
