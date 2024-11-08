package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MaximumUnitsOnTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] boxTypes = {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}};
		int truckSize = 35;
		int ans = maximumUnits(boxTypes,truckSize);
		System.out.println(ans);
	}

	private static int maximumUnits(int[][] boxTypes, int truckSize) {
		// TODO Auto-generated method stub
		Arrays.sort(boxTypes,(a,b) -> b[1] -  a[1]);
		int ans = 0;
		for(int[] i : boxTypes) {
			int count = Math.min(i[0], truckSize);
			ans += count * i[1];
			truckSize -= count;
			if(truckSize == 0 ) {
				return ans;
			}
			
		}
		return ans;
	}

}
