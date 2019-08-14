package chapter04;

public class StringTest {
	public static void main(String[] args) {
		String str1="abc";
//		String str2="abc";
		String str2=new String("abc");
		
		if(str1==str2)		System.out.println("같습니다.");
		else System.out.println("다릅니다.");
	}
}
