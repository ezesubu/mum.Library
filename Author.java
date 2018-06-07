package Library;

public class Author extends Person{
	
	private String biography;
	private Book book;
	
	public Author(String id, String firstName, String lastName, Address address, String biography, Book book) {
		super(id, firstName, lastName, address);
		this.biography = biography;
		this.book = book;
	}

	public String getBiography() {
		return biography;
	}


	
	
}
