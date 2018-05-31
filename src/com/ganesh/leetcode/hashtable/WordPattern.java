// Easy 290. Word Pattern

package com.ganesh.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba";
		String str = "dog dog dog dog";
		boolean flag = wordPattern(pattern, str);
		System.out.println(flag);
		
	}
	public static boolean wordPattern(String pattern, String str) {
		
		Map<Character, String> map = new HashMap<Character, String>();
		
		char[] charPattern = pattern.toCharArray();
		String[] arrStr = str.split(" ");
		boolean flag= true;
		if(charPattern.length != arrStr.length) {
			return false;
		}
		
		for(int i=0; i<charPattern.length;i++) {
			if(map.containsKey(charPattern[i])) {
				String temp = map.get(charPattern[i]);
				if(!temp.equals(arrStr[i])) {
					flag = false;
					break;
				}
			}
			else {
				map.put(charPattern[i], arrStr[i]);
			}
		}
		return flag;
	}	
}
