package domain;

import java.util.ArrayList;
import java.util.List;

public class CheckOutRecord {
	LibraryMember member;
	private List<CheckoutRecordEntry> checkoutRecordEntries;

	public List<CheckoutRecordEntry> getCheckoutRecordEntries() {
		return checkoutRecordEntries;
	}

	public void setCheckoutRecordEntries(List<CheckoutRecordEntry> checkoutRecordEntries) {
		this.checkoutRecordEntries = checkoutRecordEntries;
	}

	public CheckOutRecord() {
		// TODO Auto-generated constructor stub
		checkoutRecordEntries = new ArrayList<>();
		member= new LibraryMember();
	}

	public LibraryMember getMember() {
		return member;
	}

	public void setMember(LibraryMember member) {
		this.member = member;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry e) {
		this.checkoutRecordEntries.add(e);
	}
}
