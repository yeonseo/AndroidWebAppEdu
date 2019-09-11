package chapter16.thread.waitnotify;

public class Buffer {
	private static int num;
	private boolean empty=false;
	//공유객체에서 데이터를 불러오는게 좋은가?
	private String[] bread = {"식빵1","식빵2","식빵3","식빵4","식빵5","식빵6","식빵7","식빵8","식빵9","식빵10"};
	
	public synchronized String getBread() {
		if (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		while (!empty) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		empty = false;
		notifyAll();
		return bread[num];
	}
	public synchronized void setBread() {
		if (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		while (empty) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		num = (int)(Math.random()*bread.length);
		empty = true;
		this.num = num;
		System.out.println("생산자가 "+bread[num]+"를 생산하셨습니다.");
		notifyAll();
	}	
	
}
