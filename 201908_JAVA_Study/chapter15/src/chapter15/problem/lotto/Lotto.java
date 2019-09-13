package chapter15.problem.lotto;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size()<6) {
			int random = (int)(Math.random()*(45-1+1)+1);
			if(!lotto.contains(new Integer(random))) {
				lotto.add(random);
			}
		}
		
		/*HashSet을 정렬할 때 - 모든컬랙션은 정렬할 수 있다*/
		/*1*/
		TreeSet<Integer> ts = new TreeSet<Integer>(lotto);
		/*2*/
		List<Integer> list = new LinkedList<Integer>(lotto);
		Collections.sort(list);
		System.out.println(list);
		
		Iterator<Integer> itr = lotto.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
