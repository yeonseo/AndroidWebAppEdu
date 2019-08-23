package chapter06;

public class PlaneTest {

	public static void main(String[] args) {
		Plane plane1 = new Plane();
		Plane plane2 = new Plane();
		Plane plane3 = new Plane();
		
		plane1.setPlane("대한항공", "A505");;
		plane2.setPlane("티웨이항공", "Z505");;
		plane3.setPlane("제주항공", "J505");;
		System.out.println(plane1.getCompany());
		System.out.println(plane2.getCompany());
		System.out.println(plane3.getCompany());
		System.out.println(plane1.getModel());
		System.out.println(plane2.getModel());
		System.out.println(plane3.getModel());
		
		System.out.println("비행기 생성횟수 : "+Plane.getCountPlane());
		
	}

}
