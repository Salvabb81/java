package com.salva.algoritmos;

import java.util.Scanner;

public class InsertarElementoArregloOrdenadob {

	public static void main(String[] args) {
		int[] a = { 1, 12, 13, 24, 35, 36, 47, 58, 69, 89 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a number between 0 and 100: ");
		int newElement = sc.nextInt();
		sc.close();

		System.out.print("\n\nArray: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		int[] b = new int[a.length+1];
		System.arraycopy(a, 0, b, 0, a.length);
		
		for (int i = b.length - 2; i >= 0; i--) {
			if (newElement < b[i]) {
				b[i + 1] = b[i];
			} else {
				b[i + 1] = newElement;
				break;
			}
		}

		System.out.print("\n\nNew Array: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);

		}
	}

}
