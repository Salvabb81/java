package com.salva.algoritmos;

public class CombinarArreglos {
	
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] a2 = new int[10];
		int[] a3 = new int [20];
		
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
			a2[i] = (i+1) * 10;
		}
		
		System.out.print("Arrglo 1:");
		for(int i=0; i<a.length; i++) {
			System.out.print(" "+ a[i]);
		}
		
		System.out.print("\nArrglo 2:");
		for(int i=0; i<a2.length; i++) {
			System.out.print(" " + a2[i]);
		}
		
		int aux = 0;
		for(int i=0; i<a.length; i++) {
			a3[aux++] = a[i];
			a3[aux++] = a2[i];
		}
		
		System.out.print("\n\nArreglo 3:");
		for(int i=0; i<a3.length; i++) {
			System.out.print(" " + a3[i]);
		}
	}

}
