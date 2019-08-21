import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		String str = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("사이트를 입력하세요");
		str = scan.nextLine();
		if(str.contentEquals("quit")) {
			System.exit(0);
		}else if(str.matches("^www\\.(.+)$")){
			System.out.println("첫 단어를 www.로 입력하셨습니다.");
		}else {
			System.out.println("첫 단어를 www.로 입력!!");
		}
	}
}
