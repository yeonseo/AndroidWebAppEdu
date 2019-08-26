package chapter07.employee;

public class Manager extends Employee{
	private int bouns;
	public Manager (String name, String address, int salary, int rrn, int bouns) {
		super(name,address, salary, rrn);
		this.bouns=bouns;
	}
	
	void test() {
		System.out.println("name : "+this.name);
		System.out.println("address : "+this.address);
		System.out.println("salary : "+this.salary);
		//System.out.println("rrn : "+rrn);
	}
}
