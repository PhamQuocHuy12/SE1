package sedAss;

public class E_Lib {
	public static SortedSet bookList;
	public static SortedSet cardList;
	public E_Lib() {
		bookList = new SortedSet();
		cardList = new SortedSet();
	}
	public static SortedSet getBookList() {
		return bookList;
	}
	public static void setBookList(SortedSet bookList) {
		E_Lib.bookList = bookList;
	}
	public static SortedSet getCardList() {
		return cardList;
	}
	public static void setCardList(SortedSet cardList) {
		E_Lib.cardList = cardList;
	}
	
}
