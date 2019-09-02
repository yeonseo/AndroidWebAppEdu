package chapter07.studentgraduate.byteacher;

public class Graduate extends Student {
	private static String[] defaultType= {"교육조교","연구조교"};
	private String assistType;
	private double scolashipRate;
	public Graduate(String assistType, double scolashipRate) {
		this(null, 0, null, 0, 0,assistType,scolashipRate);
	}
	public Graduate(String name, int number, String major, int grade, int score,String assistType, double scolashipRate) {
		super(name, number, major, grade, score);
		int returnValue=1;
		this.assistType = "교육조교";
		for(String i : defaultType) {
			returnValue = assistType.compareTo(i);
			if (returnValue==0) {
				this.assistType = assistType;
			}
		}
	}
	public String getAssistType() {
		return assistType;
	}
	public void setAssistType(String assistType) {
		this.assistType = assistType;
	}
	public double getScolashipRate() {
		return scolashipRate;
	}
	public void setScolashipRate(double scolashipRate) {
		this.scolashipRate = scolashipRate;
	}
	@Override
	public String toString() {
		return "Graduate [assistType=" + assistType + ", scolashipRate=" + scolashipRate + ", toString()="
				+ super.toString() + "]";
	}
}
