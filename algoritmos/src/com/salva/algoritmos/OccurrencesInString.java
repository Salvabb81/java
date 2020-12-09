package com.salva.algoritmos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OccurrencesInString {

	public static void main(String[] args) {
		System.out.print("Please insert a string: ");
		Scanner sc = new Scanner(System.in);

		Map<Character, Integer> occurrences = new HashMap<Character, Integer>();

		String s = sc.nextLine();

//		int c = 0;
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = 0; j < s.length(); j++) {
//				if (s.charAt(i) == s.charAt(j) && !occurrences.containsKey(String.valueOf(s.charAt(i)))) {
//					c++;
//				}
//			}
//			if (!occurrences.containsKey(String.valueOf(s.charAt(i)))) {
//				occurrences.put(String.valueOf(s.charAt(i)), Integer.valueOf(c++));
//			}
//			c = 0;
//		}
		int ct = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(occurrences.containsKey(c)) {
				int cnt = occurrences.get(c);
				occurrences.put(c, Integer.valueOf(++cnt));
			} else {
				ct=0;
				occurrences.put(c, 1);
			  }
		}
		
		// VERSION CLÁSICA
		System.out.println("\n\n");
		for(Map.Entry<Character, Integer> entry: occurrences.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		// VERSIÓN 1.8 CON EXPRESIÓN LAMBDA
		System.out.println("\n\n");
		occurrences.forEach((k, v) -> System.out.println(k + " => " + v));;
		
		// EJEMPLOS CON STREAMS Y LAMBDAS
		String someString = "elephant";
		long count = someString.chars().filter(ch -> ch == 'e').count();
		System.out.println("\n\n" + count);
		 
		long count2 = someString.codePoints().filter(ch -> ch == 'e').count();
		System.out.println(count2);
	}

}
