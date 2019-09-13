package chapter16.thread.join;

public class SumClassTest {

	public static void main(String[] args) {
		//make shared object
		Data data = new Data();
		System.err.println("1 - 100 sum : " + data.getSum());
		
		Thread thread = new SumClass(data);
		thread.start();
		try {
			thread.join(); //main() thread pause. when Sum class end, main() thread run.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.err.println("1 - 100 sum : " + data.getSum());

	}

}
