package data;

import controller.BookController;
import controller.CheckoutController;
import controller.LoginController;
import controller.MemberController;

public class Main {
	static LoginController loginController = new LoginController();
	static CheckoutController checkoutController = new CheckoutController();
	static BookController bookController = new BookController();
	static MemberController memberController = new MemberController();
	
	static DataAccess dataAccess = new DataAccess();
	public static void main(String[] args) {
		DataAccess data = new DataAccess();
		// TODO Auto-generated method stub
		loginController.login();
		memberController.addMember();
		checkoutController.checkout("", "");

		bookController.addBookCopy(data.getBooks());
	}
	

}
