package data;

public class Main {
	static DataAccess dataAccess = DataAccessFactory.getDataAccess();

	public static void main(String[] args) {
		dataAccess.generateData();
		
//		login
//		add library member
//		checkout a book
//		add new book copy
	}

}
