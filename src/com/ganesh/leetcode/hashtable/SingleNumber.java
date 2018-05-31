package com.ganesh.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,3,2,1,5};
		int n = singleNumber(nums);
		System.out.println("Number : "+n);
		
	}
	
	public static int singleNumber(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int num=0;;
		
		for(int i=0;i<nums.length; i++) {
			if(map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			}
			else if(map.get(nums[i]) != null) {
				int a = map.get(nums[i]);
				a++;
				map.put(nums[i], a);
			}
		}
		
		/*for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int a = map.get(nums[i]);
				a++;
				map.put(nums[i], a);
			}
			else {
				map.put(nums[i], 1);
			}
		}*/
		
		for(int i=0;i<nums.length;i++) {
			if(map.get(nums[i]) != 2) {
				num=nums[i];
				break;
			}
				
		}
		return num;
		
	}

}
