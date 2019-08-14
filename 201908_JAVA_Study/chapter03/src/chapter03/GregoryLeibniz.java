package chapter03;

public class GregoryLeibniz {
	public static void main(String[] args) {
		int num =1000000;
		double PI=0.0;
		for(int i=1; i<num ; i++) {
			if(i%2==1) {
				double flag=-1.0;
				//PI=PI*flag+(4.0/(double)i);
				PI=PI+Math.pow(-1, (i-1)/2)*(4.0/(double)i);
				//System.out.println(Math.pow(-1, (i-1)/2));
			}
		}
		//System.out.println(PI*-1);
		System.out.println(PI);
//		System.out.println(4.0/(double)i);
		
	}
}
