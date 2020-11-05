package sedAss;

import java.util.Iterator;

public class test {
	public static void main (String[] args) {
		E_Lib eLibrary = new E_Lib();
		Librarian librarian = new Librarian(100000001, "Pham Quoc Huy", "Male", "30/07/2000", "113");
		Reader reader = new Reader(200000001, "Minh", "Male", "24/6/2002", "115");
		librarian.enterNewBook(1001,"how to make money", "huy", "nxb kim dong", "12/9/2017", "1.1", "fun", true);
		librarian.enterNewBook(1002,"how to spend time", "huy", "nxb kim dong", "12/9/2017", "1.1", "fun", true);
		librarian.enterNewBook(1003,"how to make a relatioship", "huy", "nxb kim dong", "12/9/2017", "1.1", "fun", true);
		// print book list
		System.out.println(E_Lib.bookList.toString());
		// check if book 1001 is available
		System.out.println("Available: "+reader.checkBook(1001));
		// reader 100000001 creates card with a book 1003
		reader.createCardRequest(100000001, 1003);
		// the card has been added but isnt approved
		System.out.println(E_Lib.cardList.toString());
		// librarian approve this card
		librarian.addressCardRequest();
		// the card list after librarian's approvement
		System.out.println(E_Lib.cardList.toString());
		// the book 1003 is not available now
		System.out.println(reader.checkBook(1003));
		// librarian delete book 1002
		librarian.deleteBook(1002);
		// book list after deletion
		System.out.println(E_Lib.bookList.toString());
		// librarian updates book 1001
		librarian.updateBook(1001, 1004, "how to create money","huy","nxb kim dong", "30/8/2019","1.3", "fun",true);
		// after change
		System.out.println(E_Lib.bookList.toString());
		}
}
