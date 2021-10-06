package com.dsa.array;

/**
 * Find maximum profit
 * @author rahul
 *
 */
public class StockBuyAndSell {

	public static void main(String[] args) {
		int a[] = {5,2,6,1,4};
		System.out.println("Maximum profit = "+maxProfit(a));
	}

	private static int maxProfit(int[] a) {
		int maxProfit = 0;
		int minSoFar = 0;
		
		for(int i=0; i<a.length; i++) {
			minSoFar = Math.min(minSoFar, a[i]);
			int profit = a[i] - minSoFar;
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

}
