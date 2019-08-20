package chapter05.box2;

public class NumberBoxTest {

	public static void main(String[] args) {
		NumberBox box1 = new NumberBox();
		NumberBox box2 = new NumberBox(10,10.258f,10.25);
		NumberBox box3 = new NumberBox(20,20.0f,20.0,'c');
		
		System.out.println(box1.toString());
		System.out.println(box2.toString());
		System.out.println(box3.toString());
		
		System.out.println(box3.calculator(10, 10.0f));
		System.out.println(box2.calculator(10, 10.0));		
	}

}
