package chapter17.problem.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class DataTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testClean.txt"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testClean.txt"));
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		list.add(new Data("홍길동","관악","99-01-11"));
		list.add(new Data("이순신","관악","99-01-11"));
		list.add(new Data("세종대왕","관악","99-01-11"));
		list.add(new Data("김유신","관악","99-01-11"));
		list.add(new Data("남연서","관악","91-05-11"));
		
		oos.writeObject(list);
		
		ArrayList<Data> list2 = new ArrayList<Data>();
		list2 = (ArrayList<Data>) ois.readObject();
		
		Iterator<Data> itr = list2.iterator();
		
		Data dataP = null;
		Data dataP2 = null;
		boolean search = false;
		while (itr.hasNext()) {
			dataP = itr.next();
			System.out.println(dataP);
			if(dataP.name.equals("홍길동")) {
				dataP2=dataP;
				search = true;
			}
		}
		if(search) {
			System.out.println("Search : " + dataP2);
		}
		if(!search) {
			System.out.println("Can Not Search ");
		}
		

	}

}

