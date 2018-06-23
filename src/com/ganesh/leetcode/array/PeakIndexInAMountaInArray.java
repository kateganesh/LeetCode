// 852. Peak Index in a Mountain Array

package com.ganesh.leetcode.array;

public class PeakIndexInAMountaInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {0,2,3,5,7,4,2,1,0};
		
		int n = peakIndexInMountainArray(A);
		
		System.out.println(n);
		

	}
	
	public static int peakIndexInMountainArray(int[] A) {
		int i=0;
		for( i=0; i<A.length-1;i++) {
			if(A[i] > A[i+1]) {
				break;
			}
		}
		return i;
	}

}
