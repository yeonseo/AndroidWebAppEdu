package chapter15.problem.collection;

public class StudentArrayClass {
	private String name;
	private String phone;
	private String address;
	public StudentArrayClass(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public String getName() {return name; 	}
	public void setName(String name) {this.name = name;	}
	public String getPhone() { return phone;	}
	public String getAddress() { return address; }
	@Override
	public String toString() {
		return "StudentArrayClass [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	public String compareTo(String o) {
		StudentArrayClass st = null;
		if(o instanceof String) {
			st.phone = o;
			if(this.phone == st.phone) return "match";
			else return "unmatch";
		}
		return null;
		
	}
	public int compareTo(Object o) {
		StudentArrayClass value = null;
		if(o instanceof StudentArrayClass) {
			value = (StudentArrayClass) o;
		}
		return phone.compareTo(value.phone);
	}
}
