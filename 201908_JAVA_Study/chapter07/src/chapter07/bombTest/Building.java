package chapter07.bombTest;

public class Building extends Bomb {

	@Override
	public void bomb() {
		System.out.println("빌딩이 뻥뻥!!!");
		
	}
	public static void Sbomb() {
		System.out.println("정적 빌딩이 뻥뻥!!!!");
	}
}
