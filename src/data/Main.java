package data;

import controller.BookController;
import controller.CheckoutController;
import controller.ControllerFactory;
import controller.LoginController;
import controller.MemberController;

public class Main {
	static DataAccess dataAccess = DataAccessFactory.getDataAccess();
	static LoginController loginController = ControllerFactory.getLoginController();
	static MemberController memberController = ControllerFactory.getMemberController();
	static CheckoutController checkoutController = ControllerFactory.getCheckoutController();
	static BookController bookController = ControllerFactory.getBookController();
	public static void main(String[] args) {
		dataAccess.generateData();
		
//		login
		loginController.login();
		
//		add library member
		memberController.addMember();
		
//		checkout a book
		checkoutController.checkoutByBookCopyNumber("", "");
		
//		add new book copy
		
		bookController.addBookCopy("");
	}

}
