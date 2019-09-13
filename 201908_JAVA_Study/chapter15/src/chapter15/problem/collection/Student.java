package chapter15.problem.collection;

import java.util.HashMap;
import java.util.Map;

public class Student{

	private String name;
	private String address;
	
	public Student() {
		super();
		this.name = null;
		this.address = null;
	}
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return " name : " + name + " address : "+ address;
	}
	
}
