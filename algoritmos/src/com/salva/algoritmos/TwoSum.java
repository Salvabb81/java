package com.salva.algoritmos;

import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
		int target = 13;
		int[] nums = {2, 7, 11, 15};
		
		int[] result = twoSum(nums, target);
		
		System.out.println("index1=" + result[0] + ", index2=" + result[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            return new int[]{map.get(nums[i]), i};
	        }else{
	            map.put(target-nums[i], i);
	        }
	    }
	 
	    return new int[]{0,0};
	}

}
