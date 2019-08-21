package chapter05.student2;

public class Student {
	private String name;
	private int number;
	 private String gender;
	 private int grade;
	 
	 public Student() {
		 this.name = null;
		 this.number = 0;
		 this.gender = null;
		 this.grade = 0;
	 }
	 public Student(String name, int number, String gender, int grade) {
		 this.name = name;
		 this.number = number;
		 this.gender = gender;
		 this.grade = grade;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public void setNumber(int number) {
		 this.number=number;
	 }
	 public void setGender(String gender) {
		 this.gender=gender;
	 }
	 public void setGrade(int grade) {
		 this.grade=grade;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 public int getNumber() {
		 return this.number;
	 }
	 public String getGender() {
		 return this.gender;
	 }
	 public int getGrade() {
		 return this.grade;
	 }
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", gender=" + gender + ", grade=" + grade + "]";
	}
	public void printGrade() {
		System.out.println("이름 : "+this.name+" 점수 : "+this.grade);
	}
	
	
}
