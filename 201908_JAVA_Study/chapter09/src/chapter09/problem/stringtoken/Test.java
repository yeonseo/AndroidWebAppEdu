package chapter09.problem.stringtoken;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		StringTokenTest st = new StringTokenTest();
		//Calendar d = new Calendar();
		int i1 = new Integer(0);
		Integer i2 = new Integer("100");
		int i3 = Integer.parseInt("100");
		String s = new String("abc");
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(s);
	}

}
