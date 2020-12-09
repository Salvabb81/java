package com.salva.algoritmos;

import java.util.Scanner;

public class AgregarElementoAArreglo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert the position: ");
		int posicion = sc.nextInt();
		
		System.out.print("Insert the new element: ");
		int nuevoElemento = sc.nextInt();
		
		int[] a = new int[args.length];
		for (int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		
		System.out.print("\n\nArray: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(" " + a[i]);
		}
		
		for(int i=a.length-2; i>=posicion; i--) {
			a[i+1] = a[i];
		}
		a[posicion] = nuevoElemento;
		
		System.out.print("\n\nNew Array: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

}
