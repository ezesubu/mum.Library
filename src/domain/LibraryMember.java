package domain;

public class LibraryMember extends Person {
	private String memberId;
	private CheckOutRecord checkOutRecord;

	public CheckOutRecord getCheckOutRecord() {
		return checkOutRecord;
	}

	public void setCheckOutRecord(CheckOutRecord checkOutRecord) {
		this.checkOutRecord = checkOutRecord;
	}

	public LibraryMember() {
		// TODO Auto-generated constructor stub
	}

	public LibraryMember(String id, String firstName, String lastName, Address address, String memNumber) {
		super(id, firstName, lastName, address);
		this.memberId = memNumber;
		// TODO Auto-generated constructor stub
	}

	public String getMemberNumber() {
		return memberId;
	}

	@Override
	public String toString() {
		return "LibraryMember [memberID=" + memberId + "]";
	}

	
	
}
