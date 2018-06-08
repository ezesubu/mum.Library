package controller;

import data.DataAccess;
import data.DataAccessFactory;
import domain.LibraryStaff;

public class LoginController {
	private DataAccess dataAccess = DataAccessFactory.getDataAccess();
	public void login(String username, String password) {
		LibraryStaff s = dataAccess.getUser(username, password);
		if (s == null) {
			System.out.println("\tInvalid username or password");
		} else {
			System.out.println("\tLogin OK");
			System.out.println("\tGranted access to " + s);
		}
	}

}
