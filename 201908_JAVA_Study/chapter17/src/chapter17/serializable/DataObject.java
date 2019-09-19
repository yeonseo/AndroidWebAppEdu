package chapter17.serializable;

import java.io.Serializable;

public class DataObject implements Serializable{
	private int num;
	private String name;

	public DataObject(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() {
		return "DataObject [num=" + num + ", name=" + name + "]";
	}
	
	

}
