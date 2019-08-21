package chapter05.test;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.setHeight(10);
		box.setWidth(10);
		box.setLength(10);
		System.out.println(box.getHeight()*box.getLength()*box.getWidth());
		System.out.println(box.boxVolume());
	}

}
