package com.salva.algoritmos;

public class ParesImparesAArreglos {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		int totalPairs = 0;
		int totalOdds = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				totalPairs++;
			} else {
				totalOdds++;
			}
		}

		int[] ap = new int[totalPairs];
		int[] ai = new int[totalOdds];

		int c1 = 0;
		int c2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ap[c1++] = a[i];
			} else {
				ai[c2++] = a[i];
			}
		}

		System.out.print("\n\nPair array: ");
		for (int i = 0; i < ap.length; i++) {
			System.out.print(" " + ap[i]);
		}

		System.out.print("\n\nOdd array: ");
		for (int i = 0; i < ai.length; i++) {
			System.out.print(" " + ai[i]);
		}

	}

}
