package chapter14.problem;

public class Test {

	public static void main(String[] args) throws NotFoundException {
		int[] numArray= {1,2,3,4,5,6};
		System.out.println(searchArray(numArray,7));
		System.out.println(searchArray(numArray,3));
	}

	public static void test0() {
		try {
			System.out.print("Hello world ");
		} finally {
			System.out.println("Finally executing");
		}
	}

	public static void test2() {
		try {
			int[] array = new int[-10];
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열 크기 음수 오류");
		} catch (Exception e) {
			System.out.println("오류");
		}
	}

	public static void throwit() {
		System.out.print("A ");
		throw new RuntimeException();
	}

	public static void throwitMain() {
		try {
			System.out.print("B ");
			throwit();
		} catch (Exception re) {
			System.out.print("C ");
		} finally {
			System.out.print("D ");
		}
		System.out.println("E ");
	}

	public static void test4() {
		try {
			someMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public static void someMethod() {
	}

	public static void test5() {
		try {
			int x = 0;
			int y = 5 / x;
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(" Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("finished");
	}

	public static void test6() {
		try {
			System.out.print("Hello world ");
		} finally {
			System.out.println("Finally executing ");
		}
	}

	public static void test7() {
//		int[] anArray = new int[3];
//		System.out.println(anArray[3]);

//		String[] strs = new String[3];
//		System.out.println(strs[0].length());

//		Integer.parseInt("abc");

		Object o = new Object();
		Integer i = (Integer) o;
	}

	public static void sub() {
		int[] array = new int[10];
		int i = 0;
		try {
			i = array[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			i = array[array.length - 1];
		}

	}

	public static void MyExceptionTest() throws MyException {
		int[] array = new int[10];
		int i = array[10];
		int number = -1;
		if (number < 0) {
			throw (new MyException("음수는 안됩니다."));
		}
	}

	public static int searchArray(int[] array,int searchNum) throws NotFoundException{
		boolean throwValue = true;
		for(int i : array) {
			if(i == searchNum) {
				throwValue = false;
				return i;
			}
		}
		if (throwValue)	throw (new NotFoundException("can't search "+searchNum));
		return searchNum;
	}
}
