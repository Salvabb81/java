package com.salva.algoritmos;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 3 };
		System.out.print("Original array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		int i = 0;
		int j = 1;

		while (j < a.length) {
			if (a[i] != a[j]) {
				i++;
				a[i] = a[j];
			}
			j++;
		}

		System.out.print("\n\nNew array: ");
		for (int k = 0; k < a.length; k++) {
			System.out.print(" " + a[k]);
		}
	}

}
