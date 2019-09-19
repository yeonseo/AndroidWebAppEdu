package chapter17.problem.test;

import java.io.Serializable;

public class Data implements Serializable {
	public String name;
	private String address;
	private String brith;
	public Data(String name, String address, String brith) {
		super();
		this.name = name;
		this.address = address;
		this.brith = brith;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", address=" + address + ", brith=" + brith + "]";
	}	
	
	
}
