package chapter16.thread.waitnotify;

public class Consumer implements Runnable {
	private Buffer buffer;
	
	public Consumer(Buffer buffer) {
		super();
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for(int i=0; i<10 ;i++) {
			String bread = buffer.getBread();
			System.out.println("소비자가 "+bread+"를 겟!!!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
