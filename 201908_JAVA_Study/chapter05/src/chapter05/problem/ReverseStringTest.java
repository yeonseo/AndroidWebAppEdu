package chapter05.problem;

public class ReverseStringTest {

	public static void main(String[] args) {
		stringReverse("HI! STUDENTS! :-)");
	}
	public static String stringReverse(String source) {
			String strReversed = null;
			for(int i=source.length()-1 ; i >= 0 ; i--) {
				strReversed=strReversed+source.charAt(i);
				System.out.print(source.charAt(i));
			}
			return strReversed;
	}
}
