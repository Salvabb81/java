package com.salva.algoritmos;

import java.util.HashSet;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 2, 7, 8, 9};
		
		int duplicate = 0;
//		
//		parent:
//		for(int i=0; i<a.length; i++) {
//			for(int j=a.length -1; j> i+1; j--) {
//				if(a[i] == a[j]) {
//					duplicate = a[i];
//					break parent;
//				}
//			}
//		}
//		
//		if(duplicate != 0) {
//			System.out.println("The duplicate number is: " + duplicate);
//		} else {
//			System.out.println("There is no duplicate number.");
//		}
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			if(!set.add(a[i])) {
				duplicate = a[i];
				break;
			}
		}
		
		System.out.println("The duplicate number is: " + duplicate);
	}

}
