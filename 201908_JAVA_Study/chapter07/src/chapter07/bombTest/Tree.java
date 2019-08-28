package chapter07.bombTest;

public class Tree extends Bomb{

	@Override
	public void bomb() {
		System.out.println("나무가 뻥뻥!!!");
		
	}
	public static void Sbomb() {
		System.out.println("정적 나무가 뻥쩡@@!!");
	}
}
