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
	}

}
