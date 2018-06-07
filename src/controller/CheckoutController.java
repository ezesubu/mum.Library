package controller;

import data.DataAccess;
import data.DataAccessFactory;
import domain.Book;
import domain.BookCopy;
import domain.CheckoutRecordEntry;
import domain.LibraryMember;

/**
 * 
 * @author Cong Khanh Tran (trancongkhanh@gmail.com)
 * Checkout controller
 */
public class CheckoutController {
	DataAccess dataAccess = DataAccessFactory.getDataAccess();
	public void checkout(String bookCopyNumber, String memberId) {
		System.out.println("Checkout bookNumber= " + bookNumber + ", memberID = " + memberId);
//		validate member ID
		LibraryMember libraryMember = dataAccess.getMemberById(memberId) ;   
		
		if (libraryMember == null) {
			System.out.println("\tMember not found. Exit");
			return;
		}
		
		BookCopy bookCopy = dataAccess.getBookCopyByNumber(bookCopyNumber);
		Book book = bookCopy.getBook();
		System.out.println("\tCheckingout book: " + book);
		
		CheckoutRecordEntry checkoutEntry = new CheckoutRecordEntry();
		checkoutEntry.setBookCopy(bookCopy);
		dataAccess.saveCheckoutEntry(checkoutEntry);
		
		
	}

}
