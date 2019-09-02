package chapter07.studentgraduate.byteacher;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("홍길", 1234, "컴공", 2, 21);
		System.out.println(s);
		
		UnderGraduate under = new UnderGraduate("홍길", 1234, "컴공", 2, 21,"로타렉트");
		System.out.println(under);
		
	}
	
	

}
