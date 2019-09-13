package chapter16.thread.yield;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) {
		//print to number
		Thread th1 = new MyThread();
		Thread th22Beep = new Thread() {
			@Override
			public void run() {
				Toolkit kit = Toolkit.getDefaultToolkit(); //한번만 만들어라 싱글톤
				 for(int i=1 ; i < 5 ; i++) {
					 if(i==2||i==3) {
						 Thread.yield();
					 }
					 else {
						 kit.beep();
					 }
					 try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
			}
		};
		th22Beep.start();
		th1.start();
	}

}
