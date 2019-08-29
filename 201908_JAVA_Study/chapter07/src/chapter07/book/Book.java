package chapter07.book;

public class Book {
	private String title;
	private String isbn;
	private int page;
	public Book(String title, String isbn, int page) {
		this.title=title;
		this.isbn=isbn;
		this.page=page;
	}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getIsbn() {return isbn;}
	public void setIsbn(String isbn) {this.isbn = isbn;}
	public int getPage() {return page;}
	public void setPage(int page) {this.page = page;}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + "]";
	}
}
