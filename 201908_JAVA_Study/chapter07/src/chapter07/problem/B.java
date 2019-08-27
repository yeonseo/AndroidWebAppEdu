package chapter07.problem;

public class B extends A{
	public void f(A a) {
		System.out.print("fb(A) ");
	}
	public void f(B b) {
		System.out.print("fb(B) ");
	}
}
