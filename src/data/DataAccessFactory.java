package data;

public final class DataAccessFactory {
	private static DataAccess dataAccess = new DataAccess();

	private DataAccessFactory() {
	}

	public static DataAccess getDataAccess() {
		return dataAccess;
	}
}
