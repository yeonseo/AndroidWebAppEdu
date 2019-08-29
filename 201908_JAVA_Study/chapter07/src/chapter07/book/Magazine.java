package chapter07.book;

public class Magazine extends Book{
	private String date;
	public Magazine(String title, String isbn, int page, String date) {
		super(title, isbn, page);	this.date=date;
	}
	public String getDate() {return date;}
	public void setDate(String date) {this.date = date;}
	@Override
	public String toString() {
		return "Magazine [getTitle()=" + getTitle() + ", getIsbn()=" + getIsbn() + ", getPage()="
				+ getPage() + " date=" + date + "]";
	}
}
