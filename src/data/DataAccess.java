package data;

import domain.Book;
import domain.BookCopy;
import domain.CheckoutEntry;
import domain.LibraryMember;

public interface DataAccess {

	LibraryMember getMemberById(String memberId);
	void loadMembers();
	void generateData();
	void loadBooks();
	BookCopy getBookCopyByNumber();
	Book getBookByISBN();
	int getNumberOfAvailableCopies(String bookId);
	void saveCheckoutEntry(CheckoutEntry checkoutEntry);
	
}
