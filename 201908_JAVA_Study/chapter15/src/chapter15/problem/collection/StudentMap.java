package chapter15.problem.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
	private static Map<String, Student> student = new HashMap<String, Student>();
	
	public static void main(String[] args) {
		setStudent("Eric", "010-1234-1234", "seoul");
		setStudent("dad", "010-1234-1234", "gumi");
		setStudent("mom", "010-1234-5678", "gumi");
		
		System.out.println(getStudent("010-1234-5678"));
		
		removeStudent("Eric", "010-1234-1234");
		
	}
	public static String getStudent(String phone) {
		String str = student.get(phone).toString();
		return str+ " phone : "+phone;
	}

	public static void setStudent(String name, String phone, String address) {
		student.put(phone, new Student(name, address));
	}
	
	public static void removeStudent(String name, String phone) {
		student.remove(phone);
		System.out.println(name + " is removed!");
	}


	
}
