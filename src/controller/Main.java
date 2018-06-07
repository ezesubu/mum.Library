package controller;

import data.DataAccess;
import data.DataAccessImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DataAccess dataAccess = new DataAccessImpl();
dataAccess.generateData();
	}

}
