package chapter09.interfacetest.compareto2;

public class Test extends ComparaTo{
	private int a;
	protected int b;
	int c;
	class MyInner {
		int d;
		public void m() {
			this.d=0;
			a=20;
			c=10;
			b=10;
		}
	}
}
