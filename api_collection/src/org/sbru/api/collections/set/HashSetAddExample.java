package org.sbru.api.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddExample {
	
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		System.out.println(hs);
		// if we try to add again the String three, it will not be duplicated
		boolean b = hs.add("three");
		System.out.println("Permite elementos duplicados: " + b);
		System.out.println(hs);
		
	}
}
