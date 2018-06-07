package data;

import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.Author;
import domain.Book;
import domain.BookCopy;
import domain.LibraryMember;

public class DataAccess {
	List<LibraryMember> libraryMembers;
	List<Book> books;
	
	public DataAccess() {
		libraryMembers = new ArrayList<>();
		books = new ArrayList<>();
	}
	public void generateData() {
		loadMembers();
		loadBooks();
	}
	private void loadBooks() {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		
		Address addrs1 = new Address("1", "Street1", "Fairfield", "Iowa", "55411");
		Author author1 = new Author("1", "AA1", "BB1", addrs1, "He is a experienced writer");
		Author author2 = new Author("2", "AA2", "BB2", addrs1, "He is experienced java developer");
		List<Author> authors = new ArrayList<>();
		authors.add(author1);
		authors.add(author2);
		
		
		book1.setISBN("123");
		book1.setMaxCheckoutDays(21);
		book1.setTitle("Beginners Java");
		book1.setAuthors(authors);
		
		BookCopy bookCopy1 = new BookCopy();
		bookCopy1.setBookCopyNum("1");
		
		//book1.setBookCopies(bookCopies);
	}
	private void loadMembers() {
		// TODO Auto-generated method stub
		System.out.println("Loading Members...");
		Address addrs1 = new Address("1", "Street1", "Fairfield", "Iowa", "55411");
		Address addrs2 = new Address("2", "Street2", "Fairfield", "Iowa", "55411");
	
		LibraryMember member1 = new LibraryMember("1", "Bishwa", "Khatri", addrs1,"1234");
		LibraryMember member2 = new LibraryMember("2", "Mafrel", "Karki", addrs2,"2345");
		LibraryMember member3 = new LibraryMember("3", "Netra", "Bhatta", addrs1, "3456");
		LibraryMember member4 = new LibraryMember("4", "Sunil", "poudel", addrs2, "4567");
		
		libraryMembers.add(member1);
		libraryMembers.add(member2);
		libraryMembers.add(member3);
		libraryMembers.add(member4);
		//System.out.println("Loading Members Successfull...");
	}
}
