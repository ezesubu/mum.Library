package domain;

import java.util.ArrayList;
import java.util.List;

public class CheckOutRecord {
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
	}
}
