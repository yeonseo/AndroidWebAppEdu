package chapter07.studentgraduate.byteacher;

public class Student {
	private String name; private int number; private String major; private int grade; private int score;

	public Student() {this(null, 0, null, 0, 0);}

	public Student(String name, int number, String major, int grade, int score) {
		super();//슈퍼는 제일 마지막(생성자를 가장 많이 표시하고 있는)에만 적어 줄 것.
		this.name = name; this.number = number; this.major = major; this.grade = grade; this.score = score;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", major=" + major + ", grade=" + grade + ", score="
				+ score + "]";
	}
}
