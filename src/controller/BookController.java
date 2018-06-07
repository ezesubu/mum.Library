package controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import domain.Address;
import domain.Author;
import domain.Book;

public class BookController {

	public void addBookCopy(List<Book> list) {
		
		//String n = System.getProperty("line.separator");
		String choices = "Enter ISBN number:";
		//001
		Scanner sc = new Scanner(System.in);
		System.out.print(choices);
		String ch = sc.next();
		System.out.println();
		Book book = searchBookByISBN(ch, list);
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("The book dont exits");
		}
	}
	
	
	public Book searchBookByISBN(String ISBN, List<Book> books) {
		for(Book book: books) {			
			if(ISBN.equals(book.getISBN())) 
				return book;
		}
		return null;
	}

}
