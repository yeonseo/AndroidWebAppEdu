package chapter16.thread.join;

public class Data {
	private int sum=0;

	public synchronized int getSum() {
		return sum;
	}

	public synchronized void setSum(int sum) {
		this.sum = sum;
	}
	
}
