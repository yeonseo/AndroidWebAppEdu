package chapter15.problem;

public class MyMath<T>{
	private T[] t;
	public <T extends Number> double getAverage(T[] t){
		double result = 0.0;
		for(T i : t) {
			result += Double.parseDouble(i + "");
		}
		return result/t.length;
	}
}
