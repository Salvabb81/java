package com.salva.algoritmos;

class Solution {
	public static String reshape(int n, String str) {

		String noSpaces = str.replace(" ", "");
		char[] a = noSpaces.toCharArray();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : a) {
			count++;
			sb.append(c);
			if (count == n) {
				count = 0;
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

}