package chapter16.thread.waitnotify;

public class Producer implements Runnable{
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public synchronized void run() {
		for(int i=0; i<10 ;i++) {
			buffer.setBread();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
