package data;

import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.Author;
import domain.Book;
import domain.BookCopy;
import domain.CheckOutRecord;
import domain.CheckoutRecordEntry;
import domain.LibraryMember;

public class DataAccessImpl implements  DataAccess {
	List<LibraryMember> libraryMembers;
	List<Book> books;
	List<CheckOutRecord> checkoutRecords;
	
	public DataAccessImpl() {
		libraryMembers = new ArrayList<>();
		books = new ArrayList<>();
		checkoutRecords = new ArrayList<CheckOutRecord>();
	}
	
	
	
	
	
	@Override
	public LibraryMember getMemberById(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	public void generateData() {
		loadMembers();
		loadBooks();
		loadCheckOutRecords();
	}
	
	@Override
	public void loadCheckOutRecords() {
		// TODO Auto-generated method stub
		System.out.println("Loading Checkout Records...");
		CheckOutRecord checkoutRecord1 = new CheckOutRecord();
		List<CheckoutRecordEntry> checkoutRecordEntries = new ArrayList<>();
		
		CheckoutRecordEntry recordEntry1 = new CheckoutRecordEntry();
		recordEntry1.setBookCopy(books.get(0).getBookCopies().get(0));
		checkoutRecordEntries.add(recordEntry1);
		checkoutRecord1.setCheckoutRecordEntries(checkoutRecordEntries);
		libraryMembers.get(0).setCheckOutRecord(checkoutRecord1);
		checkoutRecord1.setMember(libraryMembers.get(0));
		
	
	System.out.println("*****");	
		checkoutRecords.add(checkoutRecord1);
		for (CheckOutRecord checkoutrecord : checkoutRecords) {
			System.out.println("Checkout Record for"+ checkoutrecord.getMember().getFirstName());
			for (CheckoutRecordEntry checkoutRecordEntry : checkoutRecordEntries) {
				System.out.println("BookCopyNumber:"+ checkoutRecordEntry.getBookCopy().getBookCopyNum());
			}
		}
	}
	
	@Override
	public  void loadBooks() {
		// TODO Auto-generated method stub
		
		System.out.println("*****");	
		System.out.println("Loading books..");
		Address addrs1 = new Address("1", "Street1", "Fairfield", "Iowa", "55411");
		Author author1 = new Author("1", "AA1", "BB1", addrs1, "He is a experienced writer");
		Author author2 = new Author("2", "AA2", "BB2", addrs1, "He is experienced java developer");
		List<Author> authors = new ArrayList<>();
		authors.add(author1);
		authors.add(author2);
		
		//book1
		Book book1 = new Book();
		book1.setISBN("123");
		book1.setMaxCheckoutDays(21);
		book1.setTitle("Beginners Java");
		book1.setAuthors(authors);
		
		BookCopy book1Copy1 = new BookCopy();
		book1Copy1.setBookCopyNum("1");
		book1Copy1.setAvailable(true);
		book1Copy1.setBook(book1);
		
		BookCopy book1Copy2 = new BookCopy();
		book1Copy2.setBookCopyNum("2");
		book1Copy2.setAvailable(true);
		book1Copy2.setBook(book1);
		
		BookCopy book1Copy3 = new BookCopy();
		book1Copy3.setBookCopyNum("3");
		book1Copy3.setAvailable(true);
		book1Copy2.setBook(book1);
		
		List<BookCopy> book1Copies = new ArrayList<>();
		book1Copies.add(book1Copy1);
		book1Copies.add(book1Copy2);
		book1Copies.add(book1Copy3);
		
		book1.setBookCopies(book1Copies);
		
		books.add(book1);
		
		for (BookCopy bookCopy : book1Copies) {
			System.out.println("Bookcopy ID:"+bookCopy.getBookCopyNum());
		}
	}
	@Override
	public  void loadMembers() {
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
		
		for (LibraryMember member : libraryMembers) {
			System.out.println("ID: "+member.getId()+"Name:"+member.getFirstName()+ " "+ member.getLastName()+ "Member Number:"+member.getMemberNumber()+ "Address:"+ member.getAddress().getCity()+" "+ member.getAddress().getState());
		}
		//System.out.println("Loading Members Successfull...");
	}


	@Override
	public Book getBookByISBN() {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public int getNumberOfAvailableCopies(String bookId) {
		// TODO Auto-generated method stub
		
		for (Book book : books) {
			if(book.getISBN().equals(bookId))
				return book.getBookCopies().size();
		}
		return 0;
	}





	@Override
	public void saveCheckoutEntry(CheckoutRecordEntry checkoutEntry) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public BookCopy getBookCopyByNumber(String copyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
