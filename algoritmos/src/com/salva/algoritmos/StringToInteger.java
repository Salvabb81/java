package com.salva.algoritmos;

public class StringToInteger {

	public static void main(String args[]) {
		String s = " +3";

		if (s.isBlank()) {
			System.out.println("The string is empty.");
		} else {
			String result = s.trim();

			Integer i = Integer.parseInt(result);
			System.out.println("With parseInt: " + i);

			System.out.println("With valueOf: " + String.valueOf(result));
		}
	}

}
