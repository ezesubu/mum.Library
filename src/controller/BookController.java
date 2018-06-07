package controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import domain.Address;
import domain.Author;
import domain.Book;

public class BookController {

	public void addBookCopy() {
		//Arthur C. Clarke
		Address address = new Address("1", "The otherSide", "No where", "Every Where", "0123456789");
		Author author = new Author("1", "Arthur C", "Clarke", address, "was a British science fiction writer, science writer and futurist");
		List<Author> authors = new LinkedList<>();
		authors.add(author);
		List<Book> books = new LinkedList<>();
		books.add(new Book("001", "2001: A Space Odyssey", 5, authors));
		books.add(new Book("002", "3001: The Final Odyssey",  5, authors));
		//String n = System.getProperty("line.separator");
		String choices = "Enter ISBN number:";
		Scanner sc = new Scanner(System.in);
		System.out.print(choices);
		String ch = sc.next();
		System.out.println();
		System.out.println("you chose" + ch);
	}
	
	
	public Book searchBookByISBN(String ISBN, List<Book> books) {
		
	}

}
