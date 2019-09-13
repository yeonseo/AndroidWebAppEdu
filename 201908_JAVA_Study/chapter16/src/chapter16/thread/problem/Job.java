package chapter16.thread.problem;

public class Job extends Thread{
	private String thread;
	
	public Job(String thread) {
		super(thread);
	}
	
	@Override
	public void run() {
		byte n = 0;
		thread =Thread.currentThread().getName();
		while(true) System. out .println(thread+n++);
		
	}

}
//public class Job extends Thread{
//	private String thread;
//	
//	public Job(String thread) {
//		super();
//		this.thread=thread;
//	}
//	
//	@Override
//	public void run() {
//		byte n = 0;
//		while(true) System. out .println(thread+n++);
//		
//	}
//	
//}
//public class Job implements Runnable{
//	
//	@Override
//	public void run() {
//		byte n = 0;
//		while(true) System. out .println( ""+n++);
//		
//	}
//	
//}
