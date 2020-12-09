package com.salva.algoritmos;

import java.util.Scanner;

public class OrdenArreglo {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please insert 5 intergers:");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		boolean asc = false;
		boolean desc = false;
		for(int i=0; i<a.length -1; i++) {
			if(a[i] > a[i+1]) {
				desc = true;
			}
			
			if(a[i] < a[i+1]) {
				asc = true;
			}
		}
		
		if(desc && asc) {
			System.out.println("The array is not sorted.");
		}
		
		if(desc && !asc) {
			System.out.println("The array is desc sorted.");
		}
		
		if(!desc && asc) {
			System.out.println("The array is asc sorted.");
		}
		
		if(!desc && !asc) {
			System.out.println("All the integers of the array are equals.");
		}
	}
}
