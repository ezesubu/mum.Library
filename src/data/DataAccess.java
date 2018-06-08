package data;

import java.util.List;

import domain.Book;
import domain.BookCopy;
import domain.CheckoutRecordEntry;
import domain.LibraryMember;
import domain.LibraryStaff;

public interface DataAccess {
	LibraryMember getMemberById(String memberId);

	void generateData();

	void loadCheckOutRecords();

	void loadBooks();

	void loadMembers();

	BookCopy getBookCopyByNumber(String copyNumber);

	Book getBookByISBN(String ISBN);

	int getNumberOfAvailableCopies(String bookId);

	void saveBookCopy(BookCopy bookCopy);

	// for Login
	LibraryStaff getUser(String username, String password);

	// add new member
	void saveLibraryMember(LibraryMember libraryMember);

	void saveCheckoutEntry(String memberId, CheckoutRecordEntry checkoutEntry);

	List<LibraryMember> getAllLibraryMembers();


}
