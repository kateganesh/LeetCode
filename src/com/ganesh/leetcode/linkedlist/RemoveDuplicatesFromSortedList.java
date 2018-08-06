// 83. Remove Duplicates from Sorted List

package com.ganesh.leetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null;
		head = deleteDuplicates(head);
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while(current!=null && current.next !=null) {
        	if(current.val == current.next.val) {
        		current.next = current.next.next;
        	}
        	else {
        		current = current.next;
        	}
        }
        
        return head;
    }

}

class ListNode{
	int val;
	ListNode next;
}
