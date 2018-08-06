package com.ganesh.leetcode.linkedlist;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		
		
	}
	
	public static  ListNode deleteDuplicates(ListNode head) {
		
		if(head == null) {
			return head;
		}
		
		ListNode current = head.next;
		while(current != null) {
			if(head.val == current.val) {
				current = current.next;
			}
			else {
				head.next = current;
				break;
			}
		}
		
		if(head == null) {
			return head;
		}
		
		current = head.next;
		ListNode previous = head;
		
		
		
		while(current!= null && current.next !=null) {
			if(current.val == current.next.val) {
				
			}
		}
		
        return head;
    }

}

