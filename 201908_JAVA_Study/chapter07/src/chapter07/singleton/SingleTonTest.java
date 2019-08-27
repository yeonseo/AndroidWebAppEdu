package chapter07.singleton;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon single = SingleTon.gerSingleton();
		single.print();
		single.setString("nonono......");
		single.print();
	}

}
