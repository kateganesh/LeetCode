package com.ganesh.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		
		String[] words = new String[] {"gin", "zen", "gig", "msg"};
		int n = uniqueMorseRepresentations(words);
		System.out.println("Unique = "+n);
		

	}
	
	public static int uniqueMorseRepresentations(String[] words) {
		
		Set<String> set = new HashSet<String>();
		
		String[] code = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		for(String word: words) {
			StringBuilder str = new StringBuilder();
			for(int i=0;i<word.length();i++) {
				char ch = word.charAt(i);
				str.append(code[ch - 'a']);
			}
			set.add(str.toString());
		}
		return set.size();
	}

}
