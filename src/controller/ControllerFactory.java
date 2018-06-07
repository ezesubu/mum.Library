package controller;

public class ControllerFactory {

	private static CheckoutController checkoutController = new CheckoutController();
	private static MemberController memberController = new MemberController();
	private static LoginController loginController = new LoginController();
	private static BookController bookController = new BookController();

	private ControllerFactory() {
	};

	public static CheckoutController getCheckoutController() {
		return checkoutController;
	}

	public static MemberController getMemberController() {
		return memberController;
	}

	public static LoginController getLoginController() {
		return loginController;
	}

	public static BookController getBookController() {
		return bookController;
	}
}
