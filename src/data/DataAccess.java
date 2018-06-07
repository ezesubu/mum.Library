package data;

import java.util.LinkedList;
import java.util.List;

import domain.Address;
import domain.Author;
import domain.Book;

public class DataAccess {
	public void generateData() {
	        Address address = new Address("1", "The otherSide", "No where", "Every Where", "0123456789");
			Author author = new Author("1", "Arthur C", "Clarke", address, "was a British science fiction writer, science writer and futurist");
			List<Author> authors = new LinkedList<>();
			authors.add(author);
			List<Book> books = new LinkedList<>();
			books.add(new Book("001", "2001: A Space Odyssey", 5, authors));
			books.add(new Book("002", "3001: The Final Odyssey", 4, authors));
			books.add(new Book("002", "3001: The Final Odyssey", 4, authors));
	}
}
