package chapter15.generic;

public class BoxTest {

	public static void main(String[] args) {
		//before generic appeared
		Box box = new Box("Cat save World!");
		String setName = (String) box.getData();
		System.out.println(setName);
		
		Box box2 = new Box(new Integer(60)); //
		int num = (Integer) box2.getData();
		System.out.println(box2);
		
		Box box3 = new Box(new MyData("Ssada kimbob"));
		MyData md = (MyData) box3.getData();
		System.out.println(md.data);
		
		
		//using generic
		BoxGeneric<String, String> bg1 = new BoxGeneric<String, String>("Cool this!","wow");
		String str1 = bg1.getT();
		String str2 = bg1.getU();
		System.out.println(str1+str2);
		
		BoxGeneric<String, Integer> bg2 = new BoxGeneric<String, Integer>("Cool this!",30);
		String str11 = bg2.getT();
		Integer int22 = bg2.getU();
		System.out.println(str1+int22);
		
		
		//String Array
		String[] strArray = {"1","2","3"};
		String strArrayLast = BoxGeneric.getLast(strArray);
		System.out.println(strArrayLast);
		
		BoxGeneric.swap(strArray, 0, 2);
		for(String i : strArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		BoxGeneric.print(strArray);
		
		//Instance Array
		MyData[] md2 = {new MyData("one"),new MyData("Two"),new MyData("Three")};
		MyData mdLast = BoxGeneric.<MyData>getLast(md2);
		System.out.println(mdLast.data);
		
		BoxGeneric.swap(md2, 0, 2);
		for(MyData i : md2) {
			System.out.print(i.data + " ");
		}
		System.out.println();
		BoxGeneric.print(md2);
		
	}

}
