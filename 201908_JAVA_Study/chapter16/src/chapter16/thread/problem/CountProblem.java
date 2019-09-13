package chapter16.thread.problem;

class CountProblem extends Thread{
	Test demo;
	
	public CountProblem(Test td) {
	demo = td;
	}
	
	public void run() {
	demo.sub();
	}
}
