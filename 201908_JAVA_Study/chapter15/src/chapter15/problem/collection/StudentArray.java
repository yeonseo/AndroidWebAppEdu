package chapter15.problem.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentArray {
	public static void main(String[] args) {
		ArrayList<StudentArrayClass> list = new ArrayList<StudentArrayClass>();
		list.add(new StudentArrayClass("dad","010-6656-5150","gumi"));
		list.add(new StudentArrayClass("mom","010-5444-5150","gumi"));
		
		Iterator<StudentArrayClass> itr = list.iterator();
		boolean tag = false;
		while(itr.hasNext()) {
			StudentArrayClass stu = itr.next();
			if(stu.getName().equals("mom")) {
				tag = true;
				System.out.println("we found : "+stu.getName());
				System.out.println(stu.getPhone() + " " + stu.getAddress());
			}
		}
		if(tag == false) System.out.println("Not found!!");
		
		itr = list.iterator();
		while(itr.hasNext()) {
			StudentArrayClass stu = itr.next();
			if(stu.getName().equals("mom")) {
				tag = true;
				itr.remove();
				System.out.println("we removed.");
			}
		}
		if(tag == false) System.out.println("Not found!!");
		
		for(StudentArrayClass i : list) {
			System.out.println(i);
		}
	}
}


//private static Map<String,StudentArrayClass> student;
//
//public StudentArray() {
//	super();
//	this.student = new HashMap<String,StudentArrayClass>();
//}
//
//public void setStudent(String name, String phone, String address) {
//	student.put(name, new StudentArrayClass(name, phone, address));
//}
//public String getStudent(String name) {
//	String str=this.student.get(name).toString();
//	return str;
//}
//public  void removeStudent(String name) {
//	student.remove(name);
//	System.out.println(name + " is removed!");
//}