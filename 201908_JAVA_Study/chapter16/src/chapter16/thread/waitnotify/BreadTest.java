package chapter16.thread.waitnotify;

public class BreadTest {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();
		
	}

}