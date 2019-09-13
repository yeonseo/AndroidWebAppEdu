package chapter15.problem.collection;

import java.util.ArrayList;
import java.util.List;

public class RandomList<T> {
	List<T> list = new ArrayList<T>();

	public T select() {
		return list.get((int)(Math.random()*list.size()));
	}

	public void add(T item) {
		list.add(item);
	}
	
}
