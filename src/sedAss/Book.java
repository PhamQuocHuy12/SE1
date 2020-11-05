package sedAss;

public class Book implements Comparable<Object> {
	private int ISBN;
	private String title;
	private String author;
	private String publisher;
	private String publishingDate;
	private String version;
	private String category;
	private boolean status;
	public Book(int ISBN, String title, String author, String publisher
			, String publishingDate, String version, String category, boolean status) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishingDate = publishingDate;
		this.version =version;
		this.status = true;
		this.category = category;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(String publishingDate) {
		this.publishingDate = publishingDate;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean checkStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String toString() {
		String string = "";
		string += "Book: " + "{ISBN: " +getISBN()  + ", Name: " + getTitle() +"}";
		return string;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
