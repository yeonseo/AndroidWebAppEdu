package chapter16.thread.beep;

public class MyThread extends Thread{
	@Override
	public void run() {
		super.run();
		for(int i=1 ; i < 5 ; i ++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
