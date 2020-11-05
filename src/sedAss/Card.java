package sedAss;

public class Card implements Comparable<Object> {
	private int user_code;
	private int book_ISBN;
	private boolean active;
	public Card (int user_code, int book_ISBN, boolean active) {
		this.user_code = user_code;
		this.book_ISBN = book_ISBN;
		this.active = active;
	}
	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}
	public int getBook_ISBN() {
		return book_ISBN;
	}
	public void setBook_ISBN(int book_ISBN) {
		this.book_ISBN = book_ISBN;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String toString() {
		String string = "";
		string += "Card: " + "{ISBN: " +getBook_ISBN()  + ", Name: " + getUser_code() + ", Active: "+isActive()+ "}";
		return string;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
