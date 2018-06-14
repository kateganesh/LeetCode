//728. Self Dividing Numbers

package com.ganesh.leetcode.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		 
		int left =1;
		int right = 22;
		List<Integer> list = selfDividingNumbers(left, right);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
			
			
		}

	}
	
	 public  static List<Integer> selfDividingNumbers(int left, int right){
		  
		 List<Integer> list = new ArrayList<Integer>();
		 boolean flag = true;
		 int rem;
		 for(int i=left; i<=right;i++) {
			 int num = i;
			 flag = true;
			 while(num>0) {
				rem = num%10;
				num = num/10;
				if(rem == 0) {
					flag = false;
					break;
				}
				else if(i%rem!=0) {
					flag = false;
					break;
				}
			 }
			 
			 if(flag == true) {
				 list.add(i);
			 }
		 }
		 return list;
	 }

}
