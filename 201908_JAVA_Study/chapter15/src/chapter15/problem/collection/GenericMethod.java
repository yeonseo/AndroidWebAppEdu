package chapter15.problem.collection;

public class GenericMethod {

	public static void main(String[] args) {
		int intValue = 10;
		float fValue = 14.0f;
		
		a(intValue);
		a(fValue);

	}
	public static <T> void a(T t){
		System.out.println(t.getClass().getName());
	}
}
