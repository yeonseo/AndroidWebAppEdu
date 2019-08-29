package chapter07.interfacetest.compareto;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle re1 = new Rectangle(10,20);
		Rectangle re2 = new Rectangle(20,20);
		NoRectangle noRe1=new NoRectangle(10,20);
		
		re1.toString();
		re2.toString();
		
		re1.comparaTo(re2);
		re2.comparaTo(re1);
		re1.comparaTo(noRe1);
	}

}
