package controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import data.DataAccess;
import data.DataAccessFactory;
import domain.Book;
import domain.BookCopy;

public class BookController {
	DataAccess dataAccess = DataAccessFactory.getDataAccess();

	public void addBookCopy(String ISBN) {
		System.out.println("\tAdding book copy for book #" + ISBN);
		Book book = dataAccess.getBookByISBN(ISBN);
		if (book != null) {
			BookCopy bookCopy = createBookCopy(book);
			bookCopy.setBook(book);
			bookCopy.setAvailable(true);
			dataAccess.saveBookCopy(bookCopy);
			System.out.println("\tDone add book copy.");
			System.out.println("\tNumber of available copies: " + dataAccess.getNumberOfAvailableCopies(ISBN));
			
		} else {
			System.out.println("\tBook not found.");
		}
		
	}

	private BookCopy createBookCopy(Book book) {
		BookCopy bookCopy = new BookCopy();
		bookCopy.setBookCopyNum(System.currentTimeMillis() + "");
		return bookCopy;
	}

}
