package chapter17.problem.test.test;

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
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TestTest.txt"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TestTest.txt"));
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		list.add(new Data("홍길동","관악","11-11-11"));
		list.add(new Data("인순이","관악","11-11-11"));
		list.add(new Data("세종대왕","종로","55-11-11"));
		list.add(new Data("이순신","종로","33-11-11"));
		
		oos.writeObject(list);
		
		ArrayList<Data> list2 = new ArrayList<Data>();
		list2 = (ArrayList<Data>) ois.readObject();
		
		Iterator<Data> itr = list2.iterator();
		
		Data return1 = null;
		Data return2 = null;
		boolean res = false;
		while(itr.hasNext()) {
			return1 = itr.next();
			System.out.println(return1);
			if(return1.name.equals("홍길동")) {
				return2=return1;
				res = true;
			}
		}
		
		if(res) {
			
			System.out.println("Search : "+return2);
		}
		if(!res) {
			System.out.println("Can Not Search");
		}

	}

}
