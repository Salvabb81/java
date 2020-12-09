package com.salva.algoritmos;

import java.util.Scanner;

public class AgregarElementoAArreglob {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert the position: ");
		int posicion = sc.nextInt();
		
		System.out.print("Insert the new element: ");
		int nuevoElemento = sc.nextInt();
	
		sc.close();
		
		int[] a = new int[args.length];
		for (int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		
		System.out.print("\n\nArray: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(" " + a[i]);
		}
		
		int last = a[a.length-1];
		for(int i=a.length-2; i>=posicion; i--) {
			a[i+1] = a[i];
		}
		int[] b = new int[a.length + 1];
		System.arraycopy(a, 0, b, 0, a.length);
		
		b[posicion] = nuevoElemento;
		b[b.length-1] = last;
		
		System.out.print("\n\nNew Array: ");
		for(int i=0; i<b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}

}
