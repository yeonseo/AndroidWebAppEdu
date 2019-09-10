package chapter16.thread;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) {
		//print to number
		Thread th1 = new MyThread();
		Thread th2 = new MyThread();
//		result : 11223344
		th1.start();
		th2.start();
//		result : 12341234
		th1.run();
		th2.run();
		
		
		/*how to make thread 1*/
		Thread th11Beep = new MyThreadBeep();
		th11Beep.start();

		
		/*how to make thread 2*/
		Thread th22Beep = new Thread() {
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
		};
		th22Beep.start();

		th1.start();
		
		/*how to make Runnable 1*/
		Runnable r1 = new MyThreadRunTest();
		Thread tRun = new Thread(r1);
		tRun.start();
		
		/*how to make Runnable 2*/
		Thread tRun2 = new Thread(new Runnable() {

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
			
		});
		
		tRun2.start();
	}

	/*how to make Runnable 3*/
	Thread tRun3 = new Thread(()-> {
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
	);
}
