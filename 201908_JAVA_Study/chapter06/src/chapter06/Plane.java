package chapter06;

public class Plane {
	private String company; private String model; static int[] people=new int[500];
	private static int countPlane=0;
	
	public Plane() {
		this.company = null;
		this.model = null;
		Plane.countPlane++;
	}
	public Plane(String company, String model) {
		this.company = company;
		this.model = model;
		Plane.countPlane++;
	}
	
	public void setPlane(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public String getCompany() {
		return this.company;
	}
	public String getModel() {
		return this.model;
	}
	public int getPeople() {
		return people.length;
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.countPlane++;
	}
	public static int getCountPlane() {
		return countPlane;
	}
	
	
}
