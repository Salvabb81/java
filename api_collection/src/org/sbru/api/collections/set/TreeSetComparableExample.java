package org.sbru.api.collections.set;

import java.util.Set;
import java.util.TreeSet;

import org.sbru.api.collections.modelo.Alumno;

public class TreeSetComparableExample {

	public static void main(String[] args) {
		
		Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNombre().compareTo(a.getNombre()));
		sa.add(new Alumno("Salvador", 5));
		sa.add(new Alumno("Aimee", 6));
		sa.add(new Alumno("John", 4));
		sa.add(new Alumno("Peter", 7));
		sa.add(new Alumno("Lucy", 3));
		sa.add(new Alumno("Jack", 2));
		
		System.out.println(sa);
	}
}
