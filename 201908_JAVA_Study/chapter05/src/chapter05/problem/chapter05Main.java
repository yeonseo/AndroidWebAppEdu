package chapter05.problem;

public class chapter05Main {
	public static void main(String[] args) {
		for (String value : args) {
			System.out.println(value);
		} 
		
		String a = "javaprogramming";
		a = a.substring(5,7);
		char b = a.charAt(1);
		a = a + b;
		System.out.println(a);
		
		String x = "abc";
		x.toUpperCase(); 
		String y = x.replace('a', 'd');
		y = y + "xyz";
		System.out.println(y);
	}
}
