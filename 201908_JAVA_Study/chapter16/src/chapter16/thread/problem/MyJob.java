package chapter16.thread.problem;

public class MyJob extends Thread{
	public void run() {
		try {
			System.out.println("A");
			Thread.sleep(1000);
			System.out.println("B");
		} catch (InterruptedException e) {
			System.out.println("C");
		}
		System.out.println("D");
		}
}
