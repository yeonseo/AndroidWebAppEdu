package chapter16.thread.beep;

import java.awt.Toolkit;

public class MyThreadBeep extends Thread{
	@Override
	public void run() {
		Toolkit kit = Toolkit.getDefaultToolkit(); //한번만 만들어라 싱글톤
		 for(int i=1 ; i < 5 ; i++) {
			 kit.beep();
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	}
}
