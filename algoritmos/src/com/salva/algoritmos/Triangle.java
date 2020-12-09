package com.salva.algoritmos;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(2);
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(3);
		a2.add(4);
		
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(6);
		a3.add(5);
		a3.add(7);
		
		ArrayList<Integer> a4 = new ArrayList<>();
		a4.add(4);
		a4.add(1);
		a4.add(8);
		a4.add(3);
		
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
		triangle.add(a1);
		triangle.add(a2);
		triangle.add(a3);
		triangle.add(a4);
		
		System.out.println("Total = " + minimumTotal(triangle));
	}
	
	public static int minimumTotal(List<ArrayList<Integer>> triangle) {
		// Se crea un arreglo de enteros de tama�o el tama�o de triangle
		int[] total = new int[triangle.size()];
		// se obtiene el mayor indice de triangle 
		int l = triangle.size() - 1;
	 
		// Se mete en el arreglo total de enteros los valores de la base del triangulo (en este caso 4 valores: 4, 1, 8, 3)
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
	 
		// Iteraci�n decreciente de triangle desde la fila siguiente a la base del tr�angulo (o segunda fila empezando por la base)
		for (int i = triangle.size() - 2; i >= 0; i--) {
			
			// Se itera mientras j sea < al tama�o de la fila - 1 (por ej: la base es tama�o 4, pues se itera mientras j < 3) para recorrer toda la fila
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				// se inserta
				total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
	 
		return total[0];
	}
	
}
