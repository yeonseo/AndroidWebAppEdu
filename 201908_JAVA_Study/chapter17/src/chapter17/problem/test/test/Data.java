package chapter17.problem.test.test;

import java.io.Serializable;

public class Data implements Serializable{
	public String name;
	private String address;
	private String day;
	public Data(String name, String address, String day) {
		super();
		this.name = name;
		this.address = address;
		this.day = day;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", address=" + address + ", day=" + day + "]";
	}
	
}
