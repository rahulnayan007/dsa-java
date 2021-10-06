package com.dsa.array;

/**
 * 
 * @author rahul
 *
 */
public class RainWatterTrappingProblem {

	public static void main(String[] args) {
		RainWaterTrappingSolution rwts = new RainWaterTrappingSolution();
		int a[] = {3,1,2,4,0,1,3,2};
		System.out.println("Total trapped rain water = " + rwts.totalTrappedRainWater(a));
	}	
}

/**
 * 
 * Creates two auxiliary arrays to hold maximum number of blocks towards left and right of the current index which
 * will later be used to get the minimum number between them and subtract the blocks in original array at that index
 * which will give the water that is trapped at that location. Total watert trapped will be sum of all these values
 *
 */
class RainWaterTrappingSolution {
	
	int totalTrappedRainWater(int a[]) {
		int n = a.length;
		int left[] = new int[n];
		int right[] = new int[n];
		
		// Compute left auxiliary array to hold maximum number of blocks towards left from current index
		left[0] = a[0];
		for(int i=1; i<n; i++) {
			left[i] = Math.max(left[i-1], a[i]);
		}
		
		// Compute right auxiliary array to hold maximum number of blocks towards left from current index
		right[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], a[i]);
		}
		
		// Total water trapped at an index will be minimum number of blocks towards left and right from that
		// index - number of blocks at that index
		int totalTrappedRainWater = 0;
		for(int i=0; i<n; i++) {
			totalTrappedRainWater += Math.min(left[i], right[i])-a[i];
		}
		return totalTrappedRainWater;
	}
}
