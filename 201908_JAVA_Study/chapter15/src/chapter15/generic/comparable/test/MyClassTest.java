package chapter15.generic.comparable.test;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass<MyClass> m1 = new MyClass(10 , "a");
		MyClass<MyClass> m2 = new MyClass(20 , "b");
		
		int large = m1.compareTo(m2);
		switch(large) {
		case -1 :System.out.println(m1+"large"); break;
		case 1 :System.out.println(m2+"large"); break;
		case 0 :System.out.println("sam"); break;
		default : System.out.println("hey!!!!"); break;
		}
		
		String[] largeArray = {new String("1"),new String("2")
				,new String("3"),new String("4")};
		String largest = getMax(largeArray);
		System.out.println(largest);
	}
	
	public static <T extends Comparable> T getMax(T[] t){
		if(t == null || t.length == 0) return null;
		T largest = t[0];
		for(int i = 0 ; i < t.length ; i++) {
			if(largest.compareTo(t[i]) < 0) largest = t[i];
		}
		return largest;
	}

}
