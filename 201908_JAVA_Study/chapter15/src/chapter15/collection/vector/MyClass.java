package chapter15.collection.vector;

public class MyClass <T extends MyClass> implements Comparable {
	private int number;
	private String name;
	public MyClass(int number) {
		super();
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "MyClass [number=" + number + "]";
	}
	

	@Override
	public int compareTo(Object o) {
		MyClass cg = null;
		if(o instanceof MyClass) {
			cg = (MyClass) o;
		}
		if(this.number < cg.number) {
			return 1;
		}
		if(this.number > cg.number) {
			return -1;
		}
		return 0;
	}
}
