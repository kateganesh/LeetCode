// 844. Backspace String Compare

package com.ganesh.leetcode.string;

import java.util.Stack;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		
		String S = "ab#c", T = "ad#c";
		boolean flag = backspaceCompare(S, T);
		System.out.println(flag);

	}
	
	public static boolean backspaceCompare(String S, String T) {
		
		return cleanString(S).equals(cleanString(T));
	}
	
	public static String cleanString(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!= '#') {
				stack.push(str.charAt(i));
			}
			else if(!stack.empty()) {
				stack.pop();
			}
		}
		
		return String.valueOf(stack);
		
	}
	
	

}
