package org.sbru.patterns.singleton;

public class SingletonExample {

	public static void main(String[] args) {
		DBConnection con = null;
		for (int i = 0; i < 10; i++) {
			con = DBConnection.getInstance();
			System.out.println("con = " + con);
		}

		DBConnection con2 = DBConnection.getInstance();
		DBConnection con3 = DBConnection.getInstance();
		boolean b1 = ((con == con2) && (con2 == con3) && (con == con3));
		System.out.println("b1 = " + b1);

	}

}
