package chapter07.problem;

public class Costomer extends Person{
	private int customerNo;
	private int customerMileage;
	public Costomer(String name, String address, String phonNum,int customerNo, int customerMileage) {
		super(name, address, phonNum);
		this.customerNo=customerNo;
		this.customerMileage=customerMileage;
	}
	public void setCostomer(int customerNo, int customerMileage) {
		this.customerNo=customerNo;
		this.customerMileage=customerMileage;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public int getCustomerMileage() {
		return customerMileage;
	}
	@Override
	public String toString() {
		return "Costomer [customerNo=" + customerNo + ", customerMileage=" + customerMileage + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getPhonNum()=" + getPhonNum() + "]";
	}
	
}
