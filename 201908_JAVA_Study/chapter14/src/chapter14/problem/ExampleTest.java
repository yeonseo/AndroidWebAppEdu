package chapter14.problem;

public class ExampleTest {

	public static void main(String[] args) {
		int[] list = null;
		try {
			list[0] = 0;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			list = new int[10];
			list[0] = 0;
		}finally {
			System.out.println(list[0]);
		}
		
	}

}
