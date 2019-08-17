package chapter04;

public class Problem08 {
	private static void pro08()	{
		double[] d = new double[10];
		init(d);
	}	
	private static void init(double[] d)	{
		for(int i = 0 ; i <d.length ; i++) {
			d[i]=i+1.0;
			System.out.println(d[i]);
		}
	}
}
