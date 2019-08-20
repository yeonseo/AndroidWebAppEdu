package chapter05.problem;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle re = new Rectangle(10,40);
		System.out.println("사각형의 넓이 : "+re.area());
		System.out.println("사각형의 둘레 : "+re.perimeter());
		System.out.println(re.toString());
		
		float f1[ ], f2[ ]; 
		f1 = new float[10]; 
		f2 = f1; 
		System.out.println("f2[0] = " + f2[0]);
		
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
