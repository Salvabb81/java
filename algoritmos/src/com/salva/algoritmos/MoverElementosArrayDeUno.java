package com.salva.algoritmos;

import java.util.Scanner;

public class MoverElementosArrayDeUno {
	
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert 5 integers:");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("\n\nOriginal array: ");
		for(int i: a) {
			System.out.print(" " + i);
		}
		
		int lastElement= a[a.length -1];
		for(int i=a.length-2; i >= 0; i--) {
			a[i+1] = a[i];
		}
		a[0] = lastElement;
		
		System.out.print("\n\nNew array: ");
		for(int i: a) {
			System.out.print(" " + i);
		}
	}

}
