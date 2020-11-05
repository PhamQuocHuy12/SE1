package sedAss;

import java.util.Iterator;

public class Librarian extends User {

	public Librarian(int code, String fullName, String gender, String dob, String phoneNumber) {
		super(code, fullName, gender, dob, phoneNumber);
	}
	public void enterNewBook(int ISBN, String title, String author, String publisher
			, String publishingDate, String version, String category, boolean status) {
		Book book = new Book(ISBN, title, author, publisher, publishingDate, version, category, status);
		E_Lib.bookList.insert(book);
	}
	public void deleteBook(int ISBN) {
		Iterator bookList = E_Lib.bookList.iterator();
		while(bookList.hasNext()) {
			Book currentBook = (Book)bookList.next();
			if (currentBook.getISBN() == ISBN) {
				E_Lib.bookList.remove(currentBook);
				System.out.println("Remove successfully");
				break;
			} if (!bookList.hasNext()) {
				System.out.println("This book is not exist");
			}
		}
	}
	public void updateBook(int ISBN, int newISBN, String title, String author, String publisher
			, String publishingDate, String version, String category, boolean status) {
		Iterator bookList = E_Lib.bookList.iterator();
		while(bookList.hasNext()) {
			Book currentBook = ((Book)bookList.next());
			if (ISBN == currentBook.getISBN()) {
				currentBook.setAuthor(author);
				currentBook.setCategory(category);
				currentBook.setISBN(newISBN);
				currentBook.setPublisher(publisher);
				currentBook.setPublishingDate(publishingDate);
				currentBook.setStatus(status);
				currentBook.setTitle(title);
				currentBook.setVersion(version);
				System.out.println("Update Successfully");
				break;
			} if (!bookList.hasNext()) {
				System.out.println("This book is not exist");
			}
		}
	}
	public void addressCardRequest() {
		Iterator cardList = E_Lib.cardList.iterator();
		Iterator bookList = E_Lib.bookList.iterator();
		while(cardList.hasNext()) {
			boolean approve = true;
			Card currentCard = ((Card) cardList.next());
			if (!currentCard.isActive()) {
				if (approve == true) {
					currentCard.setActive(true);
					while(bookList.hasNext()) {
						Book currentBook = ((Book)bookList.next());
						if (currentBook.getISBN() == currentCard.getBook_ISBN()) {
							currentBook.setStatus(false);
							break;
						}
					}
					break;
				}	else E_Lib.cardList.remove(currentCard);
			}
		}
		
	}
	@Override
	protected boolean validateCode(int code) {
		if (code > 100000000 && code < 200000000) {
			return true;
		} else return false; 
	}
}
