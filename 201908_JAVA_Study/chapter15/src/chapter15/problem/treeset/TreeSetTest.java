package chapter15.problem.treeset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("one");map.add("two");
		map.add("three");map.add("four");
		map.add("one");
		Iterator it = map.iterator();
		while (it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		String[] s = { "사과", "배", "바나나"};
		ArrayList list = new ArrayList(Arrays.asList(s));
		list.add("포도"); System.out.println(list);
		list.add(2, "자몽"); System.out.println(list);
		System.out.println(list.get(3));
		list.remove(1); System.out.println(list);
		System.out.println(list.contains("사과"));
		System.out.println(list.indexOf("사과"));
	}

}
