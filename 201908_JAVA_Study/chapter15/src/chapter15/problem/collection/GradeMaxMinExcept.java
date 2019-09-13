package chapter15.problem.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeMaxMinExcept<T extends Double> {
	private double sum;
	private T t;
	
	public GradeMaxMinExcept() {
		super();
		this.sum = 0.0;
	}
	
	public double gradeSum(T[] t) {
		List<Double> list = new ArrayList<Double>();
		if(t instanceof Double[]) {
			for(int i=0 ; i<t.length ; i++) { list.add(t[i]); }

			Collections.sort(list);
			list.remove(0);
			list.remove(list.size());
			for(Double i : list) { sum += i; }
			return sum;
//			double min = t[0]; double max = t[0];
//			for(int i=0 ; i<t.length ; i++) {
//				list.add(t[i]);
//				if(min>t[i]) min=t[i];
//				if(max<t[i]) max=t[i];
//				sum += t[i];
//			}
//			return sum-min-max;
		}else {
			return 0.0;
		}
	}
}
