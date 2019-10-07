package model;

public class Student {
	private String name;
	private String level;
	private String gender;
	private String ban;
	private String korean;
	private String english;
	private String math;
	private String sic;
	private String soc;
	private String music;
	private String total;
	private String avg;

	public Student() {
	}

	public Student(String name, String level, String ban, String gender, String korean
			, String english, String math, String sic, String soc
			, String music, String total, String avg) {
		this.name = name;
		this.level = level;
		this.ban = ban;
		this.gender = gender;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.sic = sic;
		this.soc = soc;
		this.music = music;
		this.total = total;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String genderGroup) {
		this.gender = genderGroup;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getKorean() {
		return korean;
	}

	public void setKorean(String korean) {
		this.korean = korean;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getSic() {
		return sic;
	}

	public void setSic(String sic) {
		this.sic = sic;
	}

	public String getSoc() {
		return soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getAvg() {
		return avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}
	
}
