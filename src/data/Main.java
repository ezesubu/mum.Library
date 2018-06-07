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
	public static void main(String[] args) {
		generateData();
		// TODO Auto-generated method stub
		loginController.login();
		memberController.addMember();
		checkoutController.checkout();
		bookController.addBookCopy();
	}
	private static void generateData() {
		// TODO Auto-generated method stu0
//		Bishwa
		
	}
	

}
