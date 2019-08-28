package chapter07.bombTest;

public class House extends Bomb {

	@Override
	public void bomb() {
		System.out.println("집이 뻥!!");
	}
	public static void Sbomb() {
		System.out.println("정적 하우스 뻥!!!");
	}

}
