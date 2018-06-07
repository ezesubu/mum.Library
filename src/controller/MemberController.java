package controller;

import data.DataAccess;
import data.DataAccessFactory;
import domain.LibraryMember;

public class MemberController {
	private DataAccess dataAccess = DataAccessFactory.getDataAccess();
	public void addMember() {
//		Ezequel
	}

	
	public LibraryMember getMemberById(String memberId) {
		return dataAccess.getMemberById(memberId);
	}
}
