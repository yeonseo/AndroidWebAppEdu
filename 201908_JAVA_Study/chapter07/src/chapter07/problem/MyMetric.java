package chapter07.problem;

public class MyMetric {
	private double kilo;
	private double mile;
	
	public MyMetric(double kilo, double mile) {
		this.kilo=kilo;
		this.mile=mile;
	}
	
	double kiloToMile() {
		this.mile = this.kilo*4.14;
		return this.mile;
	}
}
