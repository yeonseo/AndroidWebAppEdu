package chapter.employee;

public class Employee {
	//1. 멤버변수 (정적멤버변수/인스턴스변수 선)
	private static int count=0;
	private double salary;
	private String name;
	//2. 생성자 오버로
	public Employee() {
		this(0.0,null);
	}
	public Employee(double salary, String name) {
		this.salary = salary;
		this.name = name;
		//this.count++;
		Employee.count++;
	}
	//3. 오버 라이드
	@Override
	protected void finalize() /*throws Throwable*/{ //예외처리
		System.out.println("ok... bye....i go...");
		this.count++;
	}
	//4.겟셋
	public static int getCount() {
		return count;
	}
	
	
}
