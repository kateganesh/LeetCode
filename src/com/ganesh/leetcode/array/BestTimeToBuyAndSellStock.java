// 121. Best Time to Buy and Sell Stock
package com.ganesh.leetcode.array;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		
		int profit = maxProfit(prices);
		System.out.println(profit);
	}
	
	public static int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i=0; i<prices.length; i++) {
			
			if(prices[i]<minPrice) {
				minPrice = prices[i];
			}
			
			else if(prices[i]-minPrice >maxProfit) {
				maxProfit = prices[i]-minPrice;
			}
		}
		
		return maxProfit;
		
	}

}
