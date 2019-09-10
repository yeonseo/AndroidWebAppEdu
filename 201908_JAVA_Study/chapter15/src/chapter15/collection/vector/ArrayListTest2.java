package chapter15.collection.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<MyClass> al = new ArrayList<MyClass>();
		al.add(new MyClass(10));
		al.add(new MyClass(20));
		al.add(new MyClass(30));
		al.add(new MyClass(40));
		al.add(new MyClass(50));
		Iterator<MyClass> itr = al.iterator() ;
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		MyClass[] myClassArray = {new MyClass(10),new MyClass(20),new MyClass(30)};
		List<MyClass> list = Arrays.asList(myClassArray);
		Iterator<MyClass> itrArray = list.iterator() ;
		while(itrArray.hasNext()) {
			System.out.println(itrArray.next());
		}
// if MyClass has not toString(), to print parents address
//		chapter15.generic.vector.MyClass@2f7a2457
//		chapter15.generic.vector.MyClass@566776ad
//		chapter15.generic.vector.MyClass@6108b2d7
//		chapter15.generic.vector.MyClass@1554909b
//		chapter15.generic.vector.MyClass@6bf256fa

	}

}
