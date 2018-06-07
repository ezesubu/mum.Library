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
		Scanner sc = new Scanner(System.in);
		System.out.print(choices);
		String ch = sc.next();
		System.out.println();
		System.out.println("you chose" + ch);
		Book book = searchBookByISBN(ch, list);
	}
	
	
	public Book searchBookByISBN(String ISBN, List<Book> books) {
		for(Book book: books) {
			if(ISBN == book.getISBN()) {
				return book;
			}else {
				return null;
			}
		}
	}

}
