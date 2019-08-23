package chapter.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1, e2,e3;
		e1 = new Employee(3400,"aaaa1");
		e2 = new Employee(3400,"aaaa2");
		e3 = new Employee(3400,"aaaa3");
		
		System.out.println("직원수 : "+Employee.getCount());
	}

}
