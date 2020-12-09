package com.salva.algoritmos;

public class FindSingleNumber {

	public static void main(String[] args) {

		int[] A = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
		System.out.println(singleNumber(A));

	}

	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}

}
