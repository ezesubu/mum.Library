package domain;

public class BookCopy {
	private Book book;
	private String bookCopyNum;
	
	public BookCopy() {
		book = new Book();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getBookCopyNum() {
		return bookCopyNum;
	}

	public void setBookCopyNum(String bookCopyNum) {
		this.bookCopyNum = bookCopyNum;
	}
}
