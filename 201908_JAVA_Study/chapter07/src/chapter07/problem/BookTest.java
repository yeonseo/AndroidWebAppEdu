package chapter07.problem;

public class BookTest {
	public static void main(String[] args) {
		Book b =new Book();
		b.setAuthor("베르나르 베르베르");
		b.setTitle("꼬마철학자");
		System.out.println(b.getAuthor());
		System.out.println(b.getTitle());
		
	}
}
