package chapter05.problem;

public class Student {
	private int age; private int rollno; private String name;
	public Student() {
		this.age=0; 	this.rollno=0; this.name=null;
	}
	public Student(int age, int rollno, String name) {
		this.age=age; this.rollno=rollno;	this.name=null;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", rollno=" + rollno + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
