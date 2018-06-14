//283. Move Zeroes

package com.ganesh.leetcode.array;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {0,1,0};
		moveZeroes(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}

	}
	
	/*public static void moveZeroes(int[] nums) {
        
		
		int track=0;
		int i=0;
		boolean flag=true;
		
		while(i<nums.length && track<nums.length) {
			if(nums[track]==0) {
				while(nums[track]==0 && track<nums.length) {
					track++;
					if(track==nums.length) {
						flag = false;
						break;
					}
				}
			}
			if(flag==true) {
				nums[i] = nums[track];
				i++;
				track++;
			}
			
		}
		
		while(i<nums.length) {
			nums[i]=0;
			i++;
		}
    }*/

	public static void moveZeroes(int[] nums) {
		int track = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				nums[track] = nums[i];
				track++;
			}
		}
		
		for(int i=track; i<nums.length; i++) {
			nums[i]=0;
		}
	}
}
