package controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import domain.Address;
import domain.Author;
import domain.Book;
import domain.BookCopy;

public class BookController {

	public void addBookCopy(List<Book> list) {
		
				
		//001
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ISBN number: ");
		String ch = sc.next();
		System.out.println();
		System.out.println("Searching book.....");
		Book book = searchBookByISBN(ch, list);
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
	
	
	private void createBookCopy(Book book) {
		Integer numCopies = book.getNumCopies();
		BookCopy bookCopy = new BookCopy(book, numCopies++);
		book.addBookCopy(bookCopy);
	}


	public Book searchBookByISBN(String ISBN, List<Book> books) {
		for(Book book: books) {			
			if(ISBN.equals(book.getISBN())) 
				return book;
		}
		return null;
	}

}
