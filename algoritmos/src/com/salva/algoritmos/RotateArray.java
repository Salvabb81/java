package com.salva.algoritmos;

import java.util.Arrays;
import java.util.Collections;

public class RotateArray {

	public static void main(String[] args) {
		int[] array = { 3, 1, 5, 4, 2 };
		int[] array2 = { 6, 7, 8, 9, 10 };
		int totalLength = array.length;
		int totalLength2 = array2.length;

		System.out.print("Array not sorted: ");
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array[i] + " ");
		}

		Arrays.sort(array);

		System.out.print("\nArray sorted: ");
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array[i] + " ");
		}

		// REVERTIR UN ARREGLO DIVIDIENDO POR 2 EL TOTALLENGTH
		for (int i = 0; i < totalLength / 2; i++) {
			int actual = array[i];
			int opposite = array[totalLength - 1 - i];
			array[i] = opposite;
			array[totalLength - 1 - i] = actual;
		}

		System.out.print("\nArray rotated: ");
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.print("\n\nArray2: ");
		for (int i = 0; i < totalLength2; i++) {
			System.out.print(array2[i] + " ");
		}

		// REVERTIR UTILIZANDO 2 TOTALLENGTH Y DECRECIENDO EN 2 EL SEGUNDO
		for (int i = 0; i < totalLength2; i++) {
			int actual = array2[i];
			int opposite = array2[totalLength - 1 - i];
			array2[i] = opposite;
			array2[totalLength - 1 - i] = actual;
			totalLength2--;
		}

		System.out.print("\nArray2 rotated: ");
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array2[i] + " ");
		}

		// REVERTIR CON COLLECTIONS UN ARRAY DE OBJETOS DE CLASE WRAPPER
		Integer[] decenas = { 10, 20, 30, 40 };

		Collections.reverse(Arrays.asList(decenas));

		System.out.print("\n\nDecenas Array rotated: ");
		for (int i = 0; i < decenas.length; i++) {
			System.out.print(decenas[i] + " ");
		}
		
		// ROTATE WITH STEPS
		int[] decenas2 = { 10, 20, 30, 40, 50, 60, 70 };
		int order = 5;
		
		System.out.print("\n\nDECENAS2 NOT ROTATED: ");
		for (int i = 0; i < decenas2.length; i++) {
			System.out.print(decenas2[i] + " ");
		}
		
		for (int i = 0; i < order; i++) {
			for (int j = decenas2.length - 1; j > 0; j--) {
				int temp = decenas2[j];
				decenas2[j] = decenas2[j - 1];
				decenas2[j - 1] = temp;
			}
		}
		
		System.out.print("\nDECENAS2 ROTATED BY " + order + " STEPS: ");
		for (int i = 0; i < decenas2.length; i++) {
			System.out.print(decenas2[i] + " ");
		}

	}
}
