package chapter07.studentgraduate;

public class JnderGraduate extends Student{
	private String type;
	public JnderGraduate(String naem, String studentNum, String major, int grade, int credit, String type) {
		super(naem, studentNum, major, grade, credit);
		this.type=type;
	}
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	public int type() {
		int typeValue = 0;
		if(this.type == "edu") typeValue=1;
		if(this.type == "study") typeValue=2;
		return typeValue;
	}
	public double money() {
		return Math.random();
	}
}
