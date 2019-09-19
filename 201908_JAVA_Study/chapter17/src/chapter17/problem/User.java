package chapter17.problem;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String phone;
	private String email;
	public User(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}
