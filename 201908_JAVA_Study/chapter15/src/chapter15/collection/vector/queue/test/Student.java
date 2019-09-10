package chapter15.collection.vector.queue.test;

public class Student<T extends Student> implements Comparable {
	private int number;
	private String name;
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student st = null;
		if(o instanceof Student) {
			st = (Student) o;
			if(this.number > st.number) return 1;
			if(this.number < st.number) return -1;
			if(this.number == st.number) return 0;
		}
		return 0;
	}
}
