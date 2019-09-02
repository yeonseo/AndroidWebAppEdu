package chapter09.problem.degreesin;

public class SinLoop {
	public static double radianToDegree(double radian) {
		double value=Math.toDegrees(radian);
		return value;
	}
	public static double degreeToRadian(double degree) {
		double value=Math.toRadians(degree);
		return value;
	}
	public static void riseUpSin() {
		for(int i = 0 ; i <=90 ; i +=5) {
			System.out.println(i + " : " +Math.sin(Math.toRadians(i)));
		}
	}
	public static void main(String[] arge) {
		riseUpSin();
	}
}
