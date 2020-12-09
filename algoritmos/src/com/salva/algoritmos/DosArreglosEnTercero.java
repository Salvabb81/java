package com.salva.algoritmos;

public class DosArreglosEnTercero {

	public static void main(String[] args) {
		int[] a = new int[9];
		int[] a2 = new int[9];
		int[] a3 = new int[18];

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			a2[i] = (i + 1) * 10;
		}

		System.out.print("Arrglo 1:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.print("\nArrglo 2:");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(" " + a2[i]);
		}

		int aux = 0;
		for (int i = 0; i < a.length; i += 3) {
			for (int j = 0; j < 3; j++) {
				a3[aux++] = a[i + j];
			}
			for (int j = 0; j < 3; j++) {
				a3[aux++] = a2[i + j];
			}
		}

		System.out.print("\n\nArreglo 3:");
		for (int i = 0; i < a3.length; i++) {
			System.out.print(" " + a3[i]);
		}
	}

}
