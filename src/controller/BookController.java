package controller;

import java.util.List;
import java.util.Scanner;

import domain.Book;

public class BookController {

	public void addBookCopy() {
//		Ezequel
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
