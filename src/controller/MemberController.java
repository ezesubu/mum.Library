package controller;

import java.util.List;

import data.DataAccess;
import data.DataAccessFactory;
import domain.Address;
import domain.LibraryMember;

public class MemberController {
	private DataAccess dataAccess = DataAccessFactory.getDataAccess();
	public void addMember() {
		Address addrs = new Address("A_11", "Street ABC", "Fairfield", "Iowa", "55411");
		LibraryMember member1 = new LibraryMember("M_10", "Q", "John", addrs, "7777");
		dataAccess.saveLibraryMember(member1);
		
		System.out.println("\tDone adding member ");
		List<LibraryMember> members = dataAccess.getAllLibraryMembers();
		for (LibraryMember m : members) {
			System.out.println("\t\t" + m);
		}
		
	}

	
	public LibraryMember getMemberById(String memberId) {
		return dataAccess.getMemberById(memberId);
	}
}
