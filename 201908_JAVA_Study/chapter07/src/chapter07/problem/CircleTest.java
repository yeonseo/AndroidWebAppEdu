package chapter07.problem;

public class CircleTest {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println(obj1.getRadius());
		System.out.println(obj1.getColor());
		System.out.println(obj1.getVolume());
		
		Cylinder obj2 = new Cylinder(5.0, 3.0, "Red");
		System.out.println(obj2.getColor()+" cylinder is "+obj2.getVolume()+" volume, "+obj2.getRadius()+" radius");
	}

}
