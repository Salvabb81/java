package org.sbru.api.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.sbru.api.collections.modelo.Alumno;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Alumno> al = new ArrayList<>();
		System.out.println(al + ", size = " + al.size());
		System.out.println("Is empty: " + al.isEmpty());
		al.add(new Alumno("Salvador", 5));
		al.add(new Alumno("Aimee", 6));
		al.add(new Alumno("John", 4));
		al.add(2, new Alumno("Peter", 7));
		al.set(3, new Alumno("Lucy", 3));

		System.out.println(al + ", size = " + al.size());

		al.remove(new Alumno("Salvador", 5));
//		al.remove(0);
		System.out.println(al + ", size = " + al.size());
		
		boolean b = al.contains(new Alumno("Salvador", 5));
		System.out.println("La lista contiene a Salvador = " + b);
		
		Object a[] = al.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println("From the array = " + a[i]);
		}
	}
}
