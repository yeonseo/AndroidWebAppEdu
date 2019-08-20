package chapter05.problem;

public class Sum {
	private int num1; private int num2; private int num3; private int sum;
	public Sum() {
		this.num1=0; this.num2=0; this.num3=0; this.sum=0;
	}
	public Sum(int num1, int num2) {
		this.num1=num1; this.num2=num2;
		this.sum=this.num1+this.num2;
	}
	public Sum(int num1, int num2, int num3) {
		this.num1=num1; this.num2=num2; this.num3=num3; 
		this.sum=this.num1+this.num2+this.num3;
	}
	public int sumCalculator(int num1, int num2) {
		return num1+num2;
		
	}
	public int sumCalculator(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
}
