package chapter07.parent;

public class Child extends Parent{
	public void print() {
		super.print();
		System.out.println("Child print");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
}
