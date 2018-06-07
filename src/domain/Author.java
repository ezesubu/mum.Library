package domain;

import java.util.List;

public class Author extends Person{
	
	private String biography;
	private List<Book> books;
	
	public Author(String id, String firstName, String lastName, Address address, String biography) {
		super(id, firstName, lastName, address);
		this.biography = biography;
		
	}

	public String getBiography() {
		return biography;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}

	@Override
	public String toString() {
		return "Author [Name " +super.getFirstName() +" " +super.getLastName()+" biography=" + biography + ", books=" + books + "]";
	}


	
	
}
