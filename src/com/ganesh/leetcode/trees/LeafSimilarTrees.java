// 872. Leaf-Similar Trees

package com.ganesh.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		leafNode(root1, list1);
		leafNode(root2, list2);
		
        return list1.equals(list2);
    }

	private static void leafNode(TreeNode root, List<Integer> listRef) {
		
		if(root != null) {
			if(root.left==null && root.right==null) {
				listRef.add(root.val);
			}
			
			leafNode(root.left, listRef);
			leafNode(root.right, listRef);
		}
	}
	

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
}
