package com.salva.algoritmos;

public class IesimoNumero {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] a2 = new int[10];
		
		int l = a.length;
		int aux = 0;
		for(int i=0; i< l/2; i++) {
			System.out.print(a[i]);
			System.out.print(" " + a[l-i-1] + "\n");
			a2[aux++] = a[i];
			a2[aux++] = a[l-i-1];
		}
		
		for(int i=0; i<l; i++) {
			System.out.print(a2[i] + " ");
		}
	}

}
