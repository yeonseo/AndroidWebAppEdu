package forblog.callbytest;

public class CallByTest {
	public static void main(String[] args) {
		String a = "Hello";
		String b = a;
		
		System.out.println("\n------ a & b -----");
		System.out.println("hashcode a : "+a.hashCode());
		System.out.println("hashcode b : "+b.hashCode());
		System.out.println("identityHashCode a : "+System.identityHashCode(a));
		System.out.println("identityHashCode b : "+System.identityHashCode(b));
		
		System.out.println("\n------ a & b +\"JAVA\"-----");
		b = a + "JAVA";
		System.out.println("hashcode a : "+a.hashCode());
		System.out.println("hashcode b : "+b.hashCode());
		System.out.println("identityHashCode a : "+System.identityHashCode(a));
		System.out.println("identityHashCode b : "+System.identityHashCode(b));
		
		System.out.println("\n------ a & b +\"JAVA\"-----");
		b = a + "JAVA";
		System.out.println("hashcode a : "+a.hashCode());
		System.out.println("hashcode b : "+b.hashCode());
		System.out.println("identityHashCode a : "+System.identityHashCode(a));
		System.out.println("identityHashCode b : "+System.identityHashCode(b));
	}
	
	
}
