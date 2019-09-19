package chapter17.problem;

import java.io.Serializable;

public class Car implements Serializable{
	
	private String name;
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	private String color;
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
}
