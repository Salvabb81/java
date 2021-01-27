package org.sbru.api.collections.set;

import java.util.LinkedList;
import java.util.ListIterator;

import org.sbru.api.collections.modelo.Alumno;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Alumno> linked = new LinkedList<>();
		System.out.println(linked + ", size = " + linked.size());
		System.out.println("Is empty: " + linked.isEmpty());
		linked.add(new Alumno("Salvador", 5));
		linked.add(new Alumno("Aimee", 6));
		linked.add(new Alumno("John", 4));
		linked.add(new Alumno("Peter", 7));
		linked.add(new Alumno("Lucy", 3));

		System.out.println(linked + ", size = " + linked.size());

		linked.addFirst(new Alumno("Rodrigo", 5));
		linked.addLast(new Alumno("Jack", 6));
		System.out.println(linked + ", size = " + linked.size());

		System.out.println("Primero = " + linked.getFirst());
		System.out.println("Primero = " + linked.peekFirst());
		System.out.println("Ultimo = " + linked.getLast());
		System.out.println("Ultimo = " + linked.peekLast());
		System.out.println("Indice 2 = " + linked.get(2));
		Alumno rodrigo = linked.removeFirst();
//		linked.pop();
		linked.removeLast();
//		 linked.pollLast();
		System.out.println(linked + ", size = " + linked.size());

		linked.remove(new Alumno("John", 4));
		System.out.println(linked + ", size = " + linked.size());

		Alumno a = new Alumno("Lucas", 9);
		linked.addLast(a);
		System.out.println("Indice de Lucas = " + linked.indexOf(a));
		linked.remove(2);
		System.out.println(linked + ", size = " + linked.size());

		linked.set(3, new Alumno("Ryan", 8));
		System.out.println(linked + ", size = " + linked.size());

		ListIterator<Alumno> li = linked.listIterator();

		System.out.println("===== Next =====");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("===== Previous =====");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
