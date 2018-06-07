package data;

import java.util.LinkedList;
import java.util.List;

import domain.Address;
import domain.Author;
import domain.Book;

public class DataAccess {
			Address address; 
			Author author;
			List<Author> authors = new LinkedList<>();
			List<Book> books = new LinkedList<>();
			
	public DataAccess() {
		address = new Address("1", "The otherSide", "No where", "Every Where", "0123456789");
		author= new Author("1", "Arthur C", "Clarke", address,
				"was a British science fiction writer, science writer and futurist");
		
		authors.add(author);
		
		books.add(new Book("001", "2001: A Space Odyssey", 5, authors));
		books.add(new Book("002", "3001: The Final Odyssey", 4, authors));
		books.add(new Book("002", "3001: The Final Odyssey", 4, authors));
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	List<Author> getAuthors(){
		return authors;
	}
}
