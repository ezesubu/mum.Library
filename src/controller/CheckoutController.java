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
	/**
	 * 
	 * There are two approaches on the book checkout
	 * 1. checkout by ISBN: ISBN -> book. A book has one or more book copies.
	 * All book copies of a book have the same ISBN, so we don't know which 
	 * physical copies are actually checkout.
	 *   
	 * 2. checkout by physical book ID: we can know exactly which book copy is checked out.
	 * Here I choose the second approach.
	 * 
	 * @param bookCopyId
	 * @param memberId
	 */
	public void checkoutByBookCopyNumber(String bookCopyId, String memberId) {
		System.out.println("\tCheckout bookCopyId=" + bookCopyId + ", memberID = " + memberId);
//		validate member ID
		LibraryMember libraryMember = dataAccess.getMemberById(memberId) ;   
		
		if (libraryMember == null) {
			System.out.println("\t\tMember not found. Exit");
			return;
		}
		
		BookCopy bookCopy = dataAccess.getBookCopyByNumber(bookCopyId);
		Book book = bookCopy.getBook();
		System.out.println("\t\tCheckingout book: " + book);
		
		int availableCopies = dataAccess.getNumberOfAvailableCopies(book.getISBN());
		System.out.println("\t\tAvailable copies: " + availableCopies);
		
		CheckoutRecordEntry checkoutEntry = new CheckoutRecordEntry();
		checkoutEntry.setBookCopy(bookCopy);		
		dataAccess.saveCheckoutEntry(memberId, checkoutEntry);
		bookCopy.setAvailable(false);
		dataAccess.saveBookCopy(bookCopy);
		System.out.println("\t\tDone checkout.");
		System.out.println("\t\tAvailable copies: " + dataAccess.getNumberOfAvailableCopies(book.getISBN()));
	}

}
