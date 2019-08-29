package chapter07.studentgraduate;

public class Graduate extends Student{
	private String group;
	public Graduate(String naem, String studentNum, String major, int grade, int credit,String group) {
		super(naem, studentNum, major, grade, credit);
		this.group=group;
	}
	public String getGroup() {return group;}
	public void setGroup(String group) {this.group = group;}
	@Override
	public String toString() {
		return "Graduate [group=" + group + ", getNaem()=" + getNaem() + ", getStudentNum()=" + getStudentNum()
				+ ", getMajor()=" + getMajor() + ", getGrade()=" + getGrade() + ", getCredit()=" + getCredit() + "]";
	}
	
}
