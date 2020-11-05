package sedAss;

import java.util.Iterator;

public class Reader extends User {

	public Reader(int code, String fullName, String gender, String dob, String phoneNumber) {
		super(code, fullName, gender, dob, phoneNumber);
		
	}
	public boolean checkBook(int ISBN) {
		Iterator bookList = E_Lib.bookList.iterator();
		while(bookList.hasNext()) {
			Book currentBook = (Book)bookList.next();
			if (currentBook.getISBN() == ISBN) {
				return currentBook.checkStatus();
			}
		} return false;
	}
	public void createCardRequest(int code, int ISBN) {
		Iterator bookList = E_Lib.bookList.iterator();
		while(bookList.hasNext()) {
			Book currentBook = (Book)bookList.next();	
			if (currentBook.getISBN()== ISBN) {
				if (currentBook.checkStatus()) {
				Card c = new Card(code, currentBook.getISBN(), false);
				E_Lib.cardList.insert(c);
				System.out.println("Create Card successfully");
				break;
				} else System.out.println("This book is not available"); break;
			} if (!bookList.hasNext()) {
				System.out.println("This book is not exist");
			}
				
		} 
	}
	@Override
	protected boolean validateCode(int code) {
		if (code > 200000000) {
			return true;
		} else return false; 
	}
}
