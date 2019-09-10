package chapter15.problem.lotto;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size()<6) {
			int random = (int)(Math.random()*(45-1+1)+1);
			lotto.add(random);
		}
		
		List<Integer> list = new LinkedList<Integer>(lotto);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
