package data;

import domain.Book;
import domain.BookCopy;
import domain.CheckoutRecordEntry;
import domain.LibraryMember;

public interface DataAccess {
	LibraryMember getMemberById(String memberId);
	void generateData();
	void loadCheckOutRecords();
	 void loadBooks();
	 void loadMembers();
	 BookCopy getBookCopyByNumber(String copyNumber);
	 Book getBookByISBN();
	 int getNumberOfAvailableCopies(String bookId);
	 void saveCheckoutEntry(CheckoutRecordEntry checkoutEntry);
	 void saveBookCopy(BookCopy bookCopy);
}
