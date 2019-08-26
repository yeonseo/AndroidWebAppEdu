package chapter07.employee;

public class ManagerTest {

	public static void main(String[] args) {
		Manager ma = new Manager("Tom", "Seoul", 10000000, 123456, 500000);
		System.out.println(ma);
		ma.test();
	}

}
