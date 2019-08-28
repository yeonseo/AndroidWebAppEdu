package chapter07.bombTest;

public abstract class Bomb {
	public Bomb() {
		super();
	}
	
	public abstract void bomb();
	public static void sbomb() {
		System.out.println("정적 폭탄이 터집니다.");
	}
}
