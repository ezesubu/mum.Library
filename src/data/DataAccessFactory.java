package data;

public final class DataAccessFactory {
	private static DataAccess dataAccess = new DataAccessImpl();

	private DataAccessFactory() {
	}

	public static DataAccess getDataAccess() {
		return dataAccess;
	}
}
