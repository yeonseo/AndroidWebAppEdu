package chapter07.studentgraduate;

public class Student {
	private String naem;
	private String studentNum;
	private String major;
	private int grade;
	private int credit;

	public Student(String naem, String studentNum, String major, int grade, int credit) {
		super();
		this.naem = naem;
		this.studentNum = studentNum;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	public String getNaem() {return naem;}
	public void setNaem(String naem) {this.naem = naem;}
	public String getStudentNum() {return studentNum;}
	public void setStudentNum(String studentNum) {this.studentNum = studentNum;}
	public String getMajor() {return major;}
	public void setMajor(String major) {this.major = major;}
	public int getGrade() {return grade;}
	public void setGrade(int grade) {this.grade = grade;}
	public int getCredit() {return credit;}
	public void setCredit(int credit) {this.credit = credit;}
	
}
