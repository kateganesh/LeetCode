package com.ganesh.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

	public static void main(String[] args) {
		
		String J = "aA", S = "aAAbbbb";
		int num = numJewelsInStones(J, S);
		System.out.println(num);
		

	}
	
	public static int numJewelsInStones(String J, String S) {
		
		Map<Character, Integer> map  = new HashMap<Character, Integer>();
		
		for(int i=0;i<J.length();i++) {
			map.put(J.charAt(i), 0);
		}
		
		int jewel = 0;
		for(int i=0; i<S.length(); i++) {
			if(map.containsKey(S.charAt(i))) {
				jewel++;
			}
		}
		
		return jewel;
	}
}
