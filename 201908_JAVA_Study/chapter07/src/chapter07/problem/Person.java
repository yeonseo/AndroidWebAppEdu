package chapter07.problem;

public class Person {
	private String name;
	private String address;
	private String phonNum;
	public Person(String name, String address, String phonNum) {
		super();
		this.name = name;
		this.address = address;
		this.phonNum = phonNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonNum() {
		return phonNum;
	}
	public void setPhonNum(String phonNum) {
		this.phonNum = phonNum;
	}
	
}
