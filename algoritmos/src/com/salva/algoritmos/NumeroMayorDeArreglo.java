package com.salva.algoritmos;

public class NumeroMayorDeArreglo {

	public static void main(String[] args) {
		int[] a = { 5, 3, 45, 71, 4, 32 };

		int max = 0;
		for (int i = 1; i < a.length; i++) {
			max = (a[max] > a[i]) ? max : i;
		}

		System.out.println("Max: " + a[max]);

	}

}
