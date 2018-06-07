package domain;

import java.util.List;

public class Book {


	private String ISBN;
	private String title;
	private Integer maxCheckoutDays;
	private List<Author> authors;
	private List<BookCopy> bookCopies;
		
	public Book(String iSBN, String title, Integer maxCheckoutDays, List<Author> authors) {
		this.ISBN = iSBN;
		this.title = title;
		this.maxCheckoutDays = maxCheckoutDays;
		this.authors = authors;
	}
	
	public void addBookCopy(BookCopy bookCopy) {
		bookCopies.add(bookCopy);
	}
	
	public Integer getNumCopies() {
		return bookCopies.size();
	}

	public String getISBN() {
		// TODO Auto-generated method stub
		return this.ISBN;
	}
 	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", maxCheckoutDays=" + maxCheckoutDays + ", authors="
				+ authors + "]";
	}
	
}
