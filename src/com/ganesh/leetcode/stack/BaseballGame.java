// 682. Baseball Game

package com.ganesh.leetcode.stack;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		
		int sum  = calPoints(ops);
		System.out.println(sum);

	}
	
	public static int calPoints(String[] ops) {
        
		Stack<Integer> stack = new Stack<Integer>();
		int sum =0;
		for(String str : ops) {
			if(str.equals("+")) {
				int top = stack.pop();
				int newTop = top + stack.peek();
				stack.push(top);
				stack.push(newTop);
			}
			else if(str.equals("D")){
				int top = 2*stack.peek();
				stack.push(top);
			}
			
			else if(str.equals("C")) {
				int rem = stack.pop();
			}
			else {
				stack.push(Integer.parseInt(str));
			}
		}
		
		for(Integer integer : stack) {
			sum+= integer;
		}
		
		return sum;
    }

}
