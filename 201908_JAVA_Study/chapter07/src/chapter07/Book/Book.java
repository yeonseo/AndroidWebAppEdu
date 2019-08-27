package chapter07.Book;

public class Book {
	private String title;
	private String isbn;	
	public Book(String title, String isbn) {
		this.title=title;
		this.isbn=isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + "]";
	}
	
	public static void main(String[] args) {
		Book myBook = new Book("The Java","123456");
		System.out.println(myBook);
	}
}
