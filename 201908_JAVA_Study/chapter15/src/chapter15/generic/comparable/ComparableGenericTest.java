package chapter15.generic.comparable;

public class ComparableGenericTest {

	public static void main(String[] args) {
		ComparableGeneric<ComparableGeneric> cg1 = new ComparableGeneric(10, "Hey");
		ComparableGeneric<ComparableGeneric> cg2 = new ComparableGeneric(20, "Hey");
		
		int value = cg1.compareTo(cg2);
		switch (value) {
		case 1: System.out.println(cg1+"is big!");break;
		case -1:System.out.println(cg2+"is big!"); break;
		case 0: System.out.println("sam!"); break;
		default : System.out.println("wake!");
		}
		ComparableGeneric[] cgArray = {new ComparableGeneric(10, "Hey1")
				,new ComparableGeneric(20, "Hey2"),new ComparableGeneric(30, "Hey3")
				,new ComparableGeneric(40, "Hey4"),new ComparableGeneric(50, "Hey5")};
		ComparableGeneric large = ComparableAlg.getMax(cgArray);
		System.out.println("largest : "+large);
		
		String[] strArray = {new String("Hey1"),new String("Hey2"),new String("Hey3"),new String("Hey4"),new String("Hey5")};
		String strLarge = ComparableAlg.getMax(strArray);
		System.out.println("largest : "+strLarge);
		
		
		ComparableGeneric large2 = getMax(cgArray);
		System.out.println("largest : "+large2);
		
		String[] strArray2 = {new String("Hey1"),new String("Hey2"),new String("Hey3"),new String("Hey4"),new String("Hey5")};
		String strLarge2 = ComparableAlg.getMax(strArray2);
		System.out.println("largest : "+strLarge2);
		
	}
	
	public static<T extends Comparable> T getMax(T[] a) {
		if(a==null || a.length==0) {
			return null;
		}
		T largest = a[0];
		for(int i =0 ; i < a.length ; i++) {
			if(largest.compareTo(a[i]) < 0) largest = a[i];
		}
		return largest;
	}

}
