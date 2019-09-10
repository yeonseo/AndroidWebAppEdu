package chapter15.collection.vector;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("===========add===========");
		al.add("garu");
		al.add("yulmu");
		for(Object i : al) { //toString Override, So "i" can read String()
			System.out.println(i);
		}
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		
		System.out.println("===========modify===========");
		al.add(0,"My Cats");
		for(Object i : al) { 
			System.out.println(i);
		}
		
		System.out.println("===========remove===========");
		al.remove("My Cats");
		for(Object i : al) {
			System.out.println(i);
		}
		
		System.out.println("===========interator===========");
		Iterator<String> itr = al.iterator();
		al.remove("My Cats");
		for(Object i : al) {
			System.out.println(i);
		}
		
	}
}
