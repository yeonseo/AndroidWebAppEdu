package chapter09.interfacetest.compareto;

public class RectangleTest {

	public static void main(String[] args) {
//		Rectangle re1 = new Rectangle(10,20);
//		Rectangle re2 = new Rectangle(20,20);
//		NoRectangle noRe1=new NoRectangle(10,20);
//		
//		re1.toString();
//		re2.toString();
//		
//		re1.comparaTo(re2);
//		re2.comparaTo(re1);
//		re1.comparaTo(noRe1);
//		
		Person p1 = new Person("A",165.0);
		Person p2 = new Person("B",167.0);
		Person[] p3 = {new Person("A",195),new Person("B",185),new Person("C",175)};
		
		System.out.println(getMaximum(p3).getName());
	}
	private static Person getMaximum(Person[] array) {
		//System.out.println("ㄴㄴ");
		Person max=array[0];
		for(int i=0;i<array.length;i++) {
			if(max.comparaTo(array[i])==1) {
				max=array[i];
			}
		}
		return max;
	}
}
