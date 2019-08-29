package chapter07.book;

public class BookTest {
	public static void main(String[] args) {
		Book myBook = new Book("The Java","123456",123);
		System.out.println(myBook);
		
		Magazine ma = new Magazine("The NOW DAY Java","123456",123,"2019 08 29");
		System.out.println(ma.toString());
	}
}
