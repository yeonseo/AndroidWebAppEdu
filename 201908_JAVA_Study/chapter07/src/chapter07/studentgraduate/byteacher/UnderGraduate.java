package chapter07.studentgraduate.byteacher;

public class UnderGraduate extends Student {
	private String club;

	public UnderGraduate() {
		this(null,0,null,0,0,null);
	}

	public UnderGraduate(String name, int number, String major, int grade, int score,String club) {
		super(name, number, major, grade, score);
		this.club=club;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "UnderGraduate [club=" + club + ", toString()=" + super.toString() + "]";
	}
	
}
