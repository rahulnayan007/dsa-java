package com.dsa.array;

/**
 * Find maximum sum from sub array using Kadane's Algorithm
 * @author rahul
 *
 */
public class KadanesAlgorithm {

	public static void main(String[] args) {
		int a[] = {-5, 400, -2, 6, 100};
		System.out.println("Maximum sum from sub array is = "+maxSumSubArray(a));

	}
	
	private static int maxSumSubArray(int a[]) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int i=0; i<a.length; i++) {
			currentSum += a[i];
			
			if(currentSum > maxSum) {
				maxSum = currentSum;
			}
			
			if(currentSum<0) {
				currentSum = 0;
			}
		}
		
		return maxSum;
	}

}
