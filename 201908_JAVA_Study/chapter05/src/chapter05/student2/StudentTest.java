package chapter05.student2;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student("냥냥",10,"여",95);
		st1.setName("멍멍");
		st1.setNumber(9);
		st1.setGender("여");
		st1.setGrade(90);
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		
		st1.printGrade();
		st2.printGrade();
	}

}
