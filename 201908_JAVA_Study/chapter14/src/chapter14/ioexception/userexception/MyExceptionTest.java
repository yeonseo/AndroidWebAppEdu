package chapter14.ioexception.userexception;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method1() throws MyException {
		throw new MyException();
	}

}
