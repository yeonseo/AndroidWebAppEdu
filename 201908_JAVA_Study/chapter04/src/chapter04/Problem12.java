package chapter04;

public class Problem12 {
	public static void pro12()	{
		double[] d = new double[] {1.0, 2.0, 3.0, 4.0};
		max(d);
	}
	public static void max(double[] d) {
		double max = d[0];
		for(int i=0 ; i < d.length ; i++) {
			if(d[i] > max) max=d[i];
		}
		System.out.println("최대값 : "+max);
	}
}
