package chapter16.thread.problem;

public class MyJobTest {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		t.interrupt();
	}
}
