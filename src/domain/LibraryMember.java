package domain;

public class LibraryMember extends Person {
private String memberNumber;
private CheckOutRecord checkOutRecord;

	public CheckOutRecord getCheckOutRecord() {
	return checkOutRecord;
}

public void setCheckOutRecord(CheckOutRecord checkOutRecord) {
	this.checkOutRecord = checkOutRecord;
}

	public LibraryMember(String id, String firstName, String lastName, Address address, String memNumber) {
		super(id, firstName, lastName, address);
		this.memberNumber = memNumber;
		// TODO Auto-generated constructor stub
	}
	
	public String getMemberNumber() {
	return memberNumber;
}

}
