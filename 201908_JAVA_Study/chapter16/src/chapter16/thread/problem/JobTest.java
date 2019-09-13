package chapter16.thread.problem;

public class JobTest {

	public static void main(String[] args) {
		Thread t1 = new Job ("로즈마리");
		Thread t2 = new Job ("애플민트");

		t1.start();
		t2.start();
		
	}
}
