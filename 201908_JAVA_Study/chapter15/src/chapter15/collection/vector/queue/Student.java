package chapter15.collection.vector.queue;

public class Student {
	public int number;
	public String name;
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
