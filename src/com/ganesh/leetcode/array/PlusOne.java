package com.ganesh.leetcode.array;

public class PlusOne {

	public static void main(String[] args) {
		
		int[] input = {9,9,9};
		int[] output = plusOne(input);
		for(int i=0; i<output.length; i++) {
			System.out.print(output[i]);
		}
	}

	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1; i>=0;i--) {
			if(digits[i]!= 9) {
				digits[i] +=1;
				break;
			}
			else {
				digits[i]=0;
			}
		}
		if(digits[0]==0) {
			int[] arr = new int[digits.length+1];
			arr[0] = 1;
			return arr;
		}
		return digits;
		
	}
}
