package chapter07.bombTest;

public class Car extends Bomb{
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bomb() {
		System.out.println("자동차가 뻥뻥!!");
		
	}
	public static void Sbomb() {
		System.out.println("정적 자동차가 뻐업ㅇ!!!");
	}

}
