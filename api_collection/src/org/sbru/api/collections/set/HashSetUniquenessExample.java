package org.sbru.api.collections.set;

import java.util.HashSet;
import java.util.Set;

import org.sbru.api.collections.modelo.Alumno;

public class HashSetUniquenessExample {

	public static void main(String[] args) {
		
		Set<Alumno> sa = new HashSet<>();
		sa.add(new Alumno("Salvador", 5));
		sa.add(new Alumno("Aimee", 6));
		sa.add(new Alumno("John", 4));
		sa.add(new Alumno("Peter", 7));
		sa.add(new Alumno("Lucy", 3));
		sa.add(new Alumno("Jack", 2));
		sa.add(new Alumno("Jack", 2));
		
		System.out.println(sa);
	}
}
