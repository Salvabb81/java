package com.salva.algoritmos;

import java.util.Scanner;

public class InsertarElementoArregloOrdenado {

	public static void main(String[] args) {
		int[] a = { 12, 13, 24, 35, 36, 47, 58, 69, 89 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a number between 0 and 100: ");
		int newElement = sc.nextInt();
		sc.close();

		System.out.print("\n\nArray: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		for (int i = a.length - 2; i >= 0; i--) {
			if (newElement < a[i]) {
				a[i + 1] = a[i];
			} else {
				a[i + 1] = newElement;
				break;
			}
		}

		System.out.print("\n\nNew Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);

		}
	}

}
