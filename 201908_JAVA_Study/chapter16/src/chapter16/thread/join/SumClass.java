package chapter16.thread.join;

public class SumClass extends Thread{
	private Data data;
	
	public SumClass(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		int sum = 0;
		for(int i = 0 ; i <= 100 ; i++) {
			sum += 100;
			data.setSum(sum);
		}
	}
}
