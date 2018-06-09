package com.ganesh.leetcode.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityNumber {

	public static void main(String[] args) {
		
		int[] nums = {3,2,3};
		int n = majorityElement(nums);
		System.out.println(n);
	}

	public static int majorityElement(int[] nums) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if(map.containsKey(i)) {
				int temp = map.get(i);
				temp++;
				map.put(i, temp);
			}
			else {
				map.put(i, 1);
			}
		}
		
		/*Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + 
                                ", Value = " + entry.getValue());
		}*/
		
		int key,value,max =0, majorityKey=0;
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			/*System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());*/
			key = entry.getKey();
			value = entry.getValue();
			if(value>max) {
				max = value;
				majorityKey=key;
				
			}
		}
		return majorityKey;
		
            
	}
	
}
