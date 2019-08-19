package chapter04;

public class StringArraysTest {
	public static void stringArrays()	{
		String[] strArr= new String[]{"String","Array","Class"};
		
		System.out.println("strArr[]");
//		System.out.println(strArr[0].hashCode());		
//		System.out.println(strArr[1].hashCode());		
//		System.out.println(strArr[2].hashCode());		
		System.out.println(System.identityHashCode(strArr[0]));	
		System.out.println(System.identityHashCode(strArr[1]));	
		System.out.println(System.identityHashCode(strArr[2]));	
		
		String strTest1 = strArr[0];
		String strTest2 = strArr[1];
		String strTest3 = strArr[2];
//		System.out.println(strTest1.hashCode());		
//		System.out.println(strTest2.hashCode());		
//		System.out.println(strTest3.hashCode());
//		System.out.println(strTest1.charAt(0));		
//		System.out.println(strTest2.charAt(0));		
//		System.out.println(strTest3.charAt(0));
		
		System.out.println("\nstrTesti = strArr[i]");
		System.out.println(System.identityHashCode(strTest1));
		System.out.println(System.identityHashCode(strTest2));
		System.out.println(System.identityHashCode(strTest3));
		System.out.println("\nstrTesti.charAt(0)");
		System.out.println(System.identityHashCode(strTest1.charAt(0)));
		System.out.println(System.identityHashCode(strTest2.charAt(0)));
		System.out.println(System.identityHashCode(strTest3.charAt(0)));
		System.out.println(strTest1.charAt(0));
		System.out.println(strTest2.charAt(0));
		System.out.println(strTest3.charAt(0));
	}
}
