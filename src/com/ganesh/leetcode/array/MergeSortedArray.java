// 88. Merge Sorted Array
package com.ganesh.leetcode.array;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		merge(nums1, m, nums2, n);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i]+",");
		}

	}
	
	/*public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=0,j=0;
		int k;
		while(i<m && j<n) {
			if(nums2[j]<=nums1[i]) {
				k=m-1;
				while(k>=i) {
					nums1[k+1]=nums1[k];
					k--;
				}
				nums1[i]=nums2[j];
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		i++;
		if(j!=n) {
			while(j<n) {
				nums1[i]=nums2[j];
				i++;
				j++;
			}
		}
		
	}*/
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int k = m+n-1, i=m-1,j=n-1;
		
		while(i>=0 && j>=0) {
			if(nums1[i]>=nums2[j]) {
				nums1[k] = nums1[i];
				i--;
				k--;
			}
			else {
				nums1[k] = nums2[j];
				j--;
				k--;
			}
		}
		if(j>=0) {
			while(j>=0) {
				nums1[k]=nums2[j];
				k--;
				j--;
			}
		}
		
	}

}
