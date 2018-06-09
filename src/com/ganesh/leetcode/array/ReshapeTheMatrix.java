// 566. Reshape the Matrix

package com.ganesh.leetcode.array;

public class ReshapeTheMatrix {

	public static void main(String[] args) {
		int[][] nums = {{1,2}, {3,4}};
		int r=2;
		int c =4;
		int[][] mat = matrixReshape(nums, r , c);
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	
	}
	
	public static int[][] matrixReshape(int[][] nums, int r, int c){
		
		int row = nums.length;
		int column = nums[0].length;
		
		if((row*column) != (r*c)) {
			return nums;
		}
		
		int[] temp = new int[row*column];
		int cnt=0;
		for(int i=0;i<row;i++) {
			for(int j=0; j<column; j++) {
				temp[cnt] = nums[i][j];
				cnt++;
			}
		}
		cnt =0;
		int[][] matrix = new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				matrix[i][j] = temp[cnt];
				cnt++;
			}
		}
		
		return matrix;
	}
}
