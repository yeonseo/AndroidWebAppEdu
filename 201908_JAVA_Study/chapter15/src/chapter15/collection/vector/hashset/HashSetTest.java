package chapter15.collection.vector.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;


public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		hs.add("AAAA");
		hs.add("BBBB");
		hs.add("CCCC");
		hs.add("DDDD");
		hs2.add("DDDD");
		hs2.add("EEEE");
		hs2.add("FFFF");
		getPrint(hs);
		
		HashSet<String> hs2AddAll = new HashSet<String>(hs2);
		HashSet<String> hs2retain = new HashSet<String>(hs2);
		HashSet<String> arrHash = new HashSet<String>();
		System.out.println("addAll");
		hs2AddAll.addAll(hs);
		getPrint(hs2AddAll);
		
		System.out.println("retain");
		//hs2retain.retainAll(hs);
		hs2retain.removeAll(hs);
		String str222 = hs2retain.toString();
		System.out.println(str222);
		
	}

	public static String getPrint(HashSet<String> t) {
//In case Set's, can't print using for()
//		for(int i=0 ; i < hs.size() ; i++) {
//		 t...	
//		}
		String str = null;
		Iterator<String> itr = t.iterator();
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		return str;
	}
}
