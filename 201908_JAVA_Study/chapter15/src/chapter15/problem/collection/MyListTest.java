package chapter15.problem.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyListTest {

	public static void main(String[] args) {
		/*Problem 9*/
//		String[] s = { "사과", "배", "바나나"};
//		ArrayList list = new ArrayList(Arrays.asList(s));
//		list.add("포도"); System.out.println(list);
//		list.add(2, "자몽"); System.out.println(list);
//		System.out.println(list.get(3));
//		list.remove(1); System.out.println(list);
//		System.out.println(list.contains("사과"));
//		System.out.println(list.indexOf("사과"));
		
		/*Problem 10*/
		List<Double> list = new ArrayList<Double>();
		list.add(5.0);
		list.add(4.0);
		list.add(3.0);
		list.add(2.0);
		list.add(1.0);
		
		System.out.println("\n"+"for");
		for(int i=0 ; i < list.size() ; i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("\n"+"for-each");
		for(Double i : list) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n"+"Iterator");
		Iterator<Double> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		List<String> listStr = new ArrayList<String>();
		listStr.add("a");
		listStr.add("b");
		listStr.add("c");
		listStr.add("d");
		listStr.add("e");
		System.out.println(listStr.toString());

	}

}
