package data;

import java.util.ArrayList;
import java.util.List;

import domain.Address;
import domain.Administrator;
import domain.Author;
import domain.Book;
import domain.BookCopy;
import domain.CheckOutRecord;
import domain.CheckoutRecordEntry;
import domain.Librarian;
import domain.LibraryMember;
import domain.LibraryStaff;
import domain.Role;

public class DataAccessImpl implements DataAccess {
	List<LibraryMember> libraryMembers;
	List<Book> books;
	List<CheckOutRecord> checkoutRecords;
	List<LibraryStaff> staffs;

	public DataAccessImpl() {
		libraryMembers = new ArrayList<>();
		books = new ArrayList<>();
		checkoutRecords = new ArrayList<CheckOutRecord>();
		staffs = new ArrayList<LibraryStaff>();

	}

	@Override
	public LibraryMember getMemberById(String memberId) {
		for (LibraryMember member : libraryMembers) {
			if (member.getId().equals(memberId))
				return member;
		}
		return null;
	}

	@Override
	public void generateData() {
		loadStaffs();
		System.out.println("");
		loadMembers();
		System.out.println("");
		loadBooks();
		System.out.println("");
		loadCheckOutRecords();
		System.out.println("");
	}

	private void loadStaffs() {
		// TODO Auto-generated method stub
		System.out.println("Loading Staff...");
		Address addrs2 = new Address("2", "Street2", "Fairfield", "Iowa", "55411");
		LibraryStaff staff = new LibraryStaff("S_15", "qwan", "asd", addrs2, "bishwa123", "123", "basd@gmail.com");
		Role role1 = new Librarian();
		Role role2 = new Administrator();
		List<Role> roles = new ArrayList<Role>();
		roles.add(role1);
		roles.add(role2);
		staff.setRoles(roles);

		staffs.add(staff);

		for (LibraryStaff s : staffs) {
			System.out.println(s);
		}
	}

	@Override
	public void loadCheckOutRecords() {
		// TODO Auto-generated method stub
		System.out.println("Loading checkout records...");
		CheckOutRecord checkoutRecord1 = new CheckOutRecord();
		List<CheckoutRecordEntry> checkoutRecordEntries = new ArrayList<>();

		CheckoutRecordEntry recordEntry1 = new CheckoutRecordEntry();
		recordEntry1.setBookCopy(books.get(0).getBookCopies().get(0));
		checkoutRecordEntries.add(recordEntry1);
		checkoutRecord1.setCheckoutRecordEntries(checkoutRecordEntries);
		libraryMembers.get(0).setCheckOutRecord(checkoutRecord1);
		checkoutRecord1.setMember(libraryMembers.get(0));

		checkoutRecords.add(checkoutRecord1);
		for (CheckOutRecord checkoutrecord : checkoutRecords) {
			for (CheckoutRecordEntry checkoutRecordEntry : checkoutrecord.getCheckoutRecordEntries()) {
				System.out.println(checkoutRecordEntry);
			}
		}
	}

	@Override
	public void loadBooks() {
		// TODO Auto-generated method stub

		System.out.println("Loading books..");
		Address addrs1 = new Address("A1", "Street1", "Fairfield", "Iowa", "55411");
		Author author1 = new Author("A1", "AA1", "BB1", addrs1, "He is a experienced writer");
		Author author2 = new Author("A2", "AA2", "BB2", addrs1, "He is experienced java developer");
		List<Author> authors = new ArrayList<>();
		authors.add(author1);
		authors.add(author2);

		// book1
		Book book1 = new Book();
		book1.setISBN("ISBN_634545");
		book1.setMaxCheckoutDays(21);
		book1.setTitle("Beginners Java");
		book1.setAuthors(authors);

		BookCopy book1Copy1 = new BookCopy();
		book1Copy1.setBookCopyNum("BC_1");
		book1Copy1.setAvailable(true);
		book1Copy1.setBook(book1);

		BookCopy book1Copy2 = new BookCopy();
		book1Copy2.setBookCopyNum("BC_2");
		book1Copy2.setAvailable(true);
		book1Copy2.setBook(book1);

		BookCopy book1Copy3 = new BookCopy();
		book1Copy3.setBookCopyNum("BC_3");
		book1Copy3.setAvailable(true);
		book1Copy2.setBook(book1);

		List<BookCopy> book1Copies = new ArrayList<>();
		book1Copies.add(book1Copy1);
		book1Copies.add(book1Copy2);
		book1Copies.add(book1Copy3);

		book1.setBookCopies(book1Copies);

		books.add(book1);
		for (Book b : books) {
			System.out.println(b);
		}
		// for (BookCopy bookCopy : book1Copies) {
		// System.out.println(bookCopy);
		// }
	}

	@Override
	public void loadMembers() {
		// TODO Auto-generated method stub
		System.out.println("Loading library members...");
		Address addrs1 = new Address("1", "Street1", "Fairfield", "Iowa", "55411");
		Address addrs2 = new Address("2", "Street2", "Fairfield", "Iowa", "55411");

		LibraryMember member1 = new LibraryMember("M_1", "Bishwa", "Khatri", addrs1, "1234");
		LibraryMember member2 = new LibraryMember("M_2", "Mafrel", "Karki", addrs2, "2345");
		LibraryMember member3 = new LibraryMember("M_3", "Netra", "Bhatta", addrs1, "3456");
		LibraryMember member4 = new LibraryMember("M_4", "Sunil", "poudel", addrs2, "4567");

		libraryMembers.add(member1);
		libraryMembers.add(member2);
		libraryMembers.add(member3);
		libraryMembers.add(member4);

		for (LibraryMember member : libraryMembers) {
			System.out.println(member + "");
		}
		// System.out.println("Loading Members Successfull...");
	}

	@Override
	public Book getBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		for (Book book : books) {
			if (book.getISBN().equals(ISBN))
				return book;
		}
		return null;
	}

	@Override
	public int getNumberOfAvailableCopies(String bookId) {
		// TODO Auto-generated method stub
		int count = 0;
		for (Book book : books) {
			if (book.getISBN().equals(bookId)) {
				for (BookCopy copy : book.getBookCopies()) {
					if (copy.isAvailable())
						count++;

				}
				return count;
			}
		}
		return count;
	}

	@Override
	public void saveCheckoutEntry(String memberId, CheckoutRecordEntry checkoutEntry) {
		CheckOutRecord r;

		// find record by member id
		boolean isRecordExist = false;
		for (CheckOutRecord checkOutRecord : checkoutRecords) {
			if (checkOutRecord.getMember().getId().equals(memberId)) {
				isRecordExist = true;
				checkOutRecord.addCheckoutEntry(checkoutEntry);
				break;
			}

		}
		if (!isRecordExist) {
			CheckOutRecord ck = new CheckOutRecord();
			LibraryMember m;
			for (LibraryMember member : libraryMembers) {
				if (member.getId().equals(memberId)) {
					m = member;
					ck.addCheckoutEntry(checkoutEntry);
					ck.setMember(m);
					checkoutRecords.add(ck);
					break;
				}
			}

		}
		// TODO Auto-generated method stub

	}

	@Override
	public BookCopy getBookCopyByNumber(String copyNumber) {
		// TODO Auto-generated method stub
		for (Book book : books) {
			for (BookCopy copy : book.getBookCopies()) {
				if (copy.getBookCopyNum().equals(copyNumber))
					return copy;
			}
		}
		return null;
	}

	@Override
	public void saveBookCopy(BookCopy bookCopy) {
		// TODO Auto-generated method stub
		Book book = bookCopy.getBook();

		for (Book bk : books) {
			if (bk.getISBN().equals(book.getISBN()))
				bk.addBookCopy(bookCopy);
		}
	}


	@Override
	public LibraryStaff getUser(String username, String password) {
		// TODO Auto-generated method stub
		for (LibraryStaff st : staffs) {
			if (st.getUserName().equals(username) && st.getPassword().equals(password))
				return st;
		}
		return null;
	}

	@Override
	public void saveLibraryMember(LibraryMember libraryMember) {
		// TODO Auto-generated method stub
		libraryMembers.add(libraryMember);

	}

	@Override
	public List<LibraryMember> getAllLibraryMembers() {
		return this.libraryMembers;
	}

}
