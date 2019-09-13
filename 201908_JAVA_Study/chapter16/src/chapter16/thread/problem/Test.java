package chapter16.thread.problem;

public class Test {
	private int count = 1;
	public synchronized void sub() {
	for (int i = 0; i < 10; i++) System.out.println(count++);
	
	}
	public static void main(String[] args) {
	Test demo = new Test();
	Thread a1 = new CountProblem(demo);
	Thread a2 = new CountProblem(demo);
	a1.start();
	a2.start();
	}

}
