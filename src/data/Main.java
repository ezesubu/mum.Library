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
		System.out.println("LOADING SAMPLE DATA...");
		dataAccess.generateData();
		System.out.println("START DOING BUSINESS...");
//		login
		System.out.println("1. LIBRARY STAFF LOGIN");
		loginController.login("bishwa123", "123");
		
//		add library member
		System.out.println("2. ADD LIBRARY MEMBER");
		memberController.addMember();
		
//		checkout a book
		System.out.println("3. LIBRARY STAFF CHECKOUT A BOOK TO LIBRARY MEMBER");
		checkoutController.checkoutByBookCopyNumber("BC_1", "M_1");
		
//		add new book copy
		System.out.println("4. LIBRARY STAFF(ADMINISTRATOR) ADD NEW BOOK COPY TO AN EXISTING BOOK");
		bookController.addBookCopy("ISBN_634545");
		
		System.out.println("DONE");
	}

}
