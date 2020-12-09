package com.salva.algoritmos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// REVERSE STRING USING COLLECTIONS AND ARRAYS
		String s = "the sky is blue";
		String[] s2 = s.split(" ");

		for (String string : s2) {
			System.out.print(string + " ");
		}

		List<String> s3 = Arrays.asList(s2);
		Collections.reverse(s3);

		System.out.println("\n");
		for (String string : s3) {
			System.out.print(string + " ");
		}

		// REVERSE STRING NOT USING COLLECTIONS AND ARRAYS
		String s4 = "the sky is blue";
		String[] s5 = s.split(" ");

		System.out.println("\n");
		for (String string : s5) {
			System.out.print(string + " ");
		}

		int totalLength = s5.length;
		for (int i = 0; i < totalLength / 2; i++) {
			String actual = s5[i];
			String opposite = s5[totalLength - 1 - i];
			s5[i] = opposite;
			s5[totalLength - 1 - i] = actual;
		}

		System.out.println("\n");
		for (String string : s5) {
			System.out.print(string + " ");
		}

		// REVERSE STRING WITHOUT ALLOCATING EXTRA SPACE
		/*
		 * 1- convertir a array de char
		 * 2- revertir las letrs de las palabras pero dejándolas en su sitio
		 * 3- revertir todo el array de char con actual/opuesto
		 */
		String cadena = "the sky is blue";
		char[] s6 = cadena.toCharArray();

		int i = 0;
		for (int j = 0; j < s6.length; j++) {
			if (s6[j] == ' ') {
				reverse(s6, i, j - 1);
				i = j + 1;
			}
		}

		reverse(s6, i, s6.length - 1);

		reverse(s6, 0, s6.length - 1);
		
		System.out.print("\n\nREVERSE STRING WITHOUT ALLOCATING EXTRA SPACE: ");
		for(int k = 0; k<s6.length; k++) {
			System.out.print(s6[k]);
		}
	}

	public static void reverse(char[] s, int i, int j) {
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}

}
