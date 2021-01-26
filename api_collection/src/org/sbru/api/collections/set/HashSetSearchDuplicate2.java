package org.sbru.api.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSearchDuplicate2 {

	public static void main(String[] args) {
	
		String[] peces = {"Corvina", "Lenguado", "Bacalao", "Salm�n", "At�n", "Lenguado"};
		
		Set<String> unicos = new HashSet<>();
		Set<String> duplicados = new HashSet<>();

		for(String pez: peces) {
			if(!unicos.add(pez)) {
				duplicados.add(pez);
			}
		}
		unicos.removeAll(duplicados);
		System.out.println("Unicos: " + unicos);
		System.out.println("Duplicados: " + duplicados);
 	}
	
}