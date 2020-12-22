package org.sbru.patterns.singleton;

public class DBConnection {

	private static DBConnection instance;

	private DBConnection() {
		System.out.println("Simulating connection to a DB...");
	}

	public static DBConnection getInstance() {
		if (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}

}
