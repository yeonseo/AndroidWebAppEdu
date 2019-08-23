package chapter06;

public class Average {
	private int num1;
	private int num2;
	private int num3;
	
	public double getAverage(int a, int b) {
		double result=0.0;
		result = (double)(a+b)/2.0;
		return result;
	}
	public double getAverage(int a, int b, int c) {
		double result=0.0;
		result = (double)(a+b+c)/2.0;
		return result;
	}
	
	public static class AverageMain{
		
	}	
}

