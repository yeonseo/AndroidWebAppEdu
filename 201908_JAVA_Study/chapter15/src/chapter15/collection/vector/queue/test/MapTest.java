package chapter15.collection.vector.queue.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student> hm = new HashMap<String, Student>();
		
		hm.put("1", new Student(1, "One"));
		hm.put("2", new Student(2, "Two"));
		hm.put("3", new Student(3, "Three"));
		
		Set<Entry<String, Student>> en = hm.entrySet();
		for(Entry<String, Student> i : en) {
			System.out.println( i.getKey() + " : " + i.getValue() );
		}
		
	
	}

}
