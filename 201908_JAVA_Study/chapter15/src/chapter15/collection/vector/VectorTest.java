package chapter15.collection.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		System.out.println("======vector======");
		Vector vc = new Vector();
		
		System.out.println("======add=======");
		vc.add(new String("world"));
		vc.add(new Integer(10));
		vc.add(new VectorClass(10));
		
		for(int i = 0 ; i < vc.size() ; i++) {
			System.out.println(vc.get(i));
		}
		for(Object i : vc) {
			System.out.println(i);
		}
		System.out.println("======remove=======");
		vc.remove(1);
		for(Object i : vc) {
			System.out.println(i);
		}
		for(int i = 0 ; i < vc.size() ; i++) {
			System.out.println(vc.get(i));
		}
		
		System.out.println("======add=======");
		vc.add(1, "Hey");
		for(Object i : vc) {
			System.out.println(i);
		}
		for(int i = 0 ; i < vc.size() ; i++) {
			System.out.println(vc.get(i));
		}

		System.out.println("======Interator=======");
		Iterator<String> itr = vc.iterator() ;
		while(itr.hasNext()) {
			String ne = null;
			System.out.println(ne = itr.next());
		}
		//did'nt use generic.
		Iterator itr2 = vc.iterator() ;
		while(itr.hasNext()) {
			String ne = null;
			System.out.println(ne = (String) itr2.next());
		}
	}

}
