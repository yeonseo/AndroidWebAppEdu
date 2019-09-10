package chapter15.collection.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		String[] str = new String[] {"z","a", "c", "d"	};
		List<String> list = Arrays.asList(str);
		
		Collections.sort(list);
		System.out.println("Sort!!!");
		itrFunc(list);
		Object[] ob = (String[]) (list.toArray());
		str = (String[]) (list.toArray());
		for(String i : str) {
			System.out.println(i);
		}
	}
	
	public static void itrFunc(List<String> list){
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
