// 409. Longest Palindrome

package com.ganesh.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abccccdd";
		
		int num = longestPalindrome(s);
		System.out.println(num);
		
	}
	
	public static int longestPalindrome(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int oddCount = 0;
		int evenCount =0;
		boolean flag = false;
		
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		
		for(int value : map.values()) {
			if(value%2 == 0) {
				evenCount += value;
			}
			else {
				oddCount+= (value/2)*2;
				flag =true;
			}
		}
		
		int finalCount = 0;
		if(oddCount>0) {
			finalCount = evenCount+oddCount+1;
		}
		else if(oddCount==0 && flag==true) {
			finalCount = evenCount+1;
		}
		else {
			finalCount = evenCount;
		}
		
		return 	finalCount;
	
	}

}
