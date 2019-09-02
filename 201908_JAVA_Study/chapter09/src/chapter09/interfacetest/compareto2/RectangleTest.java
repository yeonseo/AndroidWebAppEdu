package chapter09.interfacetest.compareto2;

public class RectangleTest {
	public static void main(String[] arge) {
		Rectangle re1 = new Rectangle(10,20);
		Rectangle re2 = new Rectangle(10,30);
		
		re1.compareTo(re2);
		
		System.out.println(re1.toString());
		System.out.println(re2.toString());
	}
}
