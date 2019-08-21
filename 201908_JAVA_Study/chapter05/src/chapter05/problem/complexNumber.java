package chapter05.problem;

public class complexNumber {
	private int real; private int imaginary;
	
	public complexNumber() {
		this.real=0; this.imaginary=0;
	}
	public complexNumber(int real , int imaginary) {
		this.real=real;	this.imaginary=imaginary;
	}
	public void setComplexNumber(int real , int imaginary) {
		this.real=real;	this.imaginary=imaginary;
	}
	public void printComplexNumber() {
		System.out.println(this.real+" + "+this.imaginary+"i");
	}
}
