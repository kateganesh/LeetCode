package com.ganesh.leetcode.hashtable;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 19;
		boolean flag = isHappy(num);
		System.out.println(flag);
	}

	private static boolean isHappy(int n) {
		boolean flag = false;
        int sqrSum = 0, rem, sum =0;
        
        while(sqrSum != 1){
            
            while(n != 0){
                rem = n%10;
                n = n/10;
                sum = sum+ rem*rem;
            }
            sqrSum = sum;
            n = sqrSum;
            sum = 0;
        }
        
        if(sqrSum == 1){
            return true;
        }
        else{
            return false;
        }
	}

		
}
