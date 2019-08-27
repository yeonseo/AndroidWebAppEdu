package chapter07.problem;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A ba = (A) b;
		a.f(a);
		a.f(b);
		b.f(a);
		b.f(b);
		a.f(ba);
		b.f(ba);
		ba.f(a);
		ba.f(b);
		ba.f(ba);
	}

}
