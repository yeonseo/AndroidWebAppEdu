package chapter16.thread.study;

import java.awt.Toolkit;

//import com.sun.javafx.tk.Toolkit;

public class BeepTest {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit beep = Toolkit.getDefaultToolkit();
				for(int i=0 ; i < 5 ; i++) {
					beep.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
	}

}
