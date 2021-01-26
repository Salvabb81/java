package org.sbru.api.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.sbru.api.collections.modelo.Alumno;

public class HashSetUniquenessExample {

	public static void main(String[] args) {
		
		Set<Alumno> sa = new HashSet<>();
		List<Alumno> sa2 = new ArrayList<>();
		sa.add(new Alumno("Salvador", 5));
		sa.add(new Alumno("Aimee", 6));
		sa.add(new Alumno("John", 4));
		sa.add(new Alumno("Peter", 7));
		sa.add(new Alumno("Lucy", 3));
		sa.add(new Alumno("Jack", 2));
		sa.add(new Alumno("Jack", 2));
		
		System.out.println(sa);
		
		System.out.println("Iterating with normal for:");
		for (int i = 0; i < sa.size(); i++) {
			System.out.println(sa2.get(i));
		}
		
		System.out.println("Iterating using foreach:");
		for(Alumno a: sa) {
			System.out.println(a);
		}
		
		System.out.println("Iterating using while and iterator:");
		Iterator<Alumno> it = sa.iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			System.out.println(a.getNombre());
		}
		
		System.out.println("Iterating using Stream foreach:");
		sa.forEach(System.out::println);
	}
}
