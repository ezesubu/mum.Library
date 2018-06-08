package domain;

import java.util.ArrayList;
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
	
	public Book() {
		authors = new ArrayList<>();
		bookCopies = new ArrayList<>();
	}

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getMaxCheckoutDays() {
		return maxCheckoutDays;
	}
	public void setMaxCheckoutDays(Integer maxCheckoutDays) {
		this.maxCheckoutDays = maxCheckoutDays;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public List<BookCopy> getBookCopies() {
		return bookCopies;
	}
	public void setBookCopies(List<BookCopy> bookCopies) {
		this.bookCopies = bookCopies;
	}


	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", maxCheckoutDays=" + maxCheckoutDays + ", authors="
				+ authors + "]";
	}
}
