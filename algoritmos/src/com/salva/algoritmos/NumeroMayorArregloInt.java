package com.salva.algoritmos;

import java.util.Scanner;

public class NumeroMayorArregloInt {
	
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Type an int: ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("Array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(" " + a[i]);
		}
		
		int max = 0;
		for(int i=0; i<a.length; i++) {
			max = max < a[i]? a[i]: max;
		}
		
		System.out.print("\n\nMax num: " + max);
	}

}
