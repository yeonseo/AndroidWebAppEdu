package chapter07.shape;

public class ShapeTest {
	public static void printLocation(Shape s) {
		System.out.println(" x = "+s.x +" y = "+s.y);
	}
	public static void main(String[] args) {
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Circle s3 = new Circle();
		
		printLocation(s1);
		printLocation(s2);
		printLocation(s3);
		
		Movable[] movable = {new Circle(), new Rectangle(), new Triangle()};
	}
}
//public static void main(String[] args) {
//Shape s1, s2, s3, s4;
// s1 = new Shape();
// s2 = new Rectangle();
// s3 = new Triangle();
// s4 = new Circle();
// 
// s1.draw();
// s2.draw();
// s3.draw();
// s4.draw();
//}

//private static Shape arrayOfShapes[];
//public static void main(String[] args) {
//	init();
//	drawAll();
//}
//public static void init() {
//	arrayOfShapes = new Shape[3];
//	arrayOfShapes[0] = new Rectangle();
//	arrayOfShapes[1] = new Triangle();
//	arrayOfShapes[2] = new Circle();
//}
//public static void drawAll() {
//	for(Shape i : arrayOfShapes) {
//		i.draw();
//	}
//}