package com.salva.algoritmos;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 4, 4, 5};
		
		System.out.print("Old array: ");
		for(int i=0; i<a.length; i++ ) {
			System.out.print(a[i] + " ");
		}

		int j = 0;
		int i = 1;

		while (i < a.length) {
			if (a[i] != a[j]) {
				j++;
				a[j] = a[i];
			}

			i++;
		}
		
		
		System.out.print("\n\nNew array: ");
		for(int k=0; k<a.length; k++ ) {
			System.out.print(a[k] + " ");
		}
	}

}
