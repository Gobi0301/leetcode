package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class SumInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums = {{7,2,1},
			        	{6,4,2},
				        {6,5,3},
				        {3,2,1}};
		int ans = matrixSum(nums);
		System.out.println(ans);
	}

	private static int matrixSum(int[][] nums) {
		// TODO Auto-generated method stub
		int totalSum = 0;
		int curr = 0;
		for(int[] i:nums) {
			Arrays.sort(i);
		}
		
		for(int j=0;j<nums[0].length;j++) {
			for(int i=0;i<nums.length;i++) {
				curr = Math.max(curr, nums[i][j]);
			}
			totalSum+=curr;
			curr = 0;
		}
				return totalSum;
	}

}
