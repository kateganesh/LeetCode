// 20. Valid Parentheses

package com.ganesh.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "";
		
		boolean val = isValid(s);
		System.out.println(val);

	}
	
	public static boolean isValid(String s) {
		
		if(s.isEmpty()) {
			return true;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				char c = stack.pop();
				if(c != '(') {
					return false;
				}
			}
			
			else if(s.charAt(i) == '}') {
				if(stack.isEmpty()) {
					return false;
				}
				char c = stack.pop();
				if(c != '{') {
					return false;
				}
			}
			
			else {
				if(stack.isEmpty()) {
					return false;
				}
				char c = stack.pop();
				if(c != '[') {
					return false;
				}
			}	
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
