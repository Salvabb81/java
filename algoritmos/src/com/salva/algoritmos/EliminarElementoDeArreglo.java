package com.salva.algoritmos;

import java.util.Scanner;

public class EliminarElementoDeArreglo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.print("Array: ");
		for(int i: a) {
			System.out.print(" " + i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nInsert the position to delete: ");
		int positionToDelete = sc.nextInt();
		
		for(int i=0; i<a.length-1; i++) {
			if(i >= positionToDelete) {
				a[i] = a[i+1];
			}
		}
		
		int[] b = new int[a.length-1];
		System.arraycopy(a, 0, b, 0, b.length);
		
		System.out.print("\n\nNew array: ");
		for(int i: b) {
			System.out.print(" " + i);
		}
	}

}
