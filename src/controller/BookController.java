package controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import data.DataAccess;
import data.DataAccessFactory;
import domain.Address;
import domain.Author;
import domain.Book;
import domain.BookCopy;

public class BookController {
	DataAccess dataAccess = DataAccessFactory.getDataAccess();
	public void addBookCopy(String ISBN) {
		Book book = dataAccess.getBookByISBN(ISBN);
		if(book != null) {
			System.out.println(book);
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Do you want add a Copy for this book: 'Y' ");
			String ch1 = sc1.next();
			if(ch1.equals("y") || ch1.equals("Y")) {
				createBookCopy(book);
			}else {
				System.out.println("the copy was not created");
			}
		}else {
			System.out.println("The book dont exits");
		}
	}
	
	
	private BookCopy createBookCopy(Book book) {
		BookCopy bookCopy = new BookCopy();
		bookCopy.setBookCopyNum(System.currentTimeMillis() + "");
		return bookCopy;
	}


	public Book searchBookByISBN(String ISBN, List<Book> books) {
		for(Book book: books) {			
			if(ISBN.equals(book.getISBN())) 
				return book;
		}
		return null;
	}

}
