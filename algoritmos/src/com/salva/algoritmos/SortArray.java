package com.salva.algoritmos;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		// ORDENANDO CON ARRAYS.SORT
		int[] array = { 5, 2, 4, 1, 3 };

		System.out.print("Array not sorted: ");

		int totalLength = array.length;
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array[i] + " ");
		}

		Arrays.sort(array);

		System.out.print("\n\nArray sorted: ");

		for (int i = 0; i < totalLength; i++) {
			System.out.print(array[i] + " ");
		}

		// ORDENANDO CON BUBBLE SORT
		int[] array2 = { 5, 2, 4, 1, 3 };
		int c = 0;

		for (int i = 0; i < totalLength; i++) {
			for (int j = 0; j < totalLength; j++) {
				if (array2[i] < array2[j]) {
					int temp = array2[i];
					array2[i] = array2[j];
					array2[j] = temp;
				}
				c++;
			}
		}

		
		System.out.print("\n\nArray2 sorted with bubble sort: ");
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.print("\nContador = " + c);

		// ORDENANDO CON BUBBLE SORT CON COMPARETO
		Integer[] array3 = { 5, 2, 4, 1, 3 };
		int c2 = 0;

		for (int i = 0; i < totalLength; i++) {
			for (int j = 0; j < totalLength; j++) {
				if (array3[i].compareTo(array3[j]) < 0) {
					Integer temp = array3[i];
					array3[i] = array3[j];
					array3[j] = temp;
				}
				c2++;
			}
		}

		System.out.print("\n\nArray3 sorted with bubble sort and compareTo method: ");
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.print("\nContador = " + c2);

		
		// MEJORANDO EL BUBBLE SORT
		Integer[] array4 = { 5, 2, 4, 1, 3 };
		int c3 = 0;
		
		for (int i = 0; i < totalLength -1; i++) {
			for (int j = 0; j < totalLength -1 -i; j++) {
				if (array4[j+1] < array4[j]) {
					int temp = array4[j];
					array4[j] = array4[j+1];
					array4[j+1] = temp;
				}
				c3++;
			}
		}
		
		System.out.print("\n\nArray3 sorte with bubble sort improved: ");
		for (int i = 0; i < totalLength; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.print("\nContador = " + c3);
		
	}

}
