package domain;

public class CheckoutRecordEntry {
	BookCopy bookCopy;

	public CheckoutRecordEntry() {
		// TODO Auto-generated constructor stub
		bookCopy = new BookCopy();
	}

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	public void setBookCopy(BookCopy bookCopy) {
		this.bookCopy = bookCopy;
	}

	@Override
	public String toString() {
		return "CheckoutRecordEntry [bookCopy=" + bookCopy + "]";
	}

}
