package org.sbru.api.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.sbru.api.collections.modelo.Alumno;

public class ListComparableComparatorExample {

	public static void main(String[] args) {
		
		List<Alumno> sa = new ArrayList<>();
		sa.add(new Alumno("Salvador", 5));
		sa.add(new Alumno("Aimee", 6));
		sa.add(new Alumno("John", 4));
		sa.add(new Alumno("Peter", 7));
		sa.add(new Alumno("Lucy", 3));
		sa.add(new Alumno("Jack", 2));
		sa.add(new Alumno("Jack", 2));
//		Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
//		sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
		sa.sort(Comparator.comparing(Alumno::getNota).reversed());
		System.out.println(sa);
		
		System.out.println("Iterating using Stream foreach:");
		sa.forEach(System.out::println);
	}
}
