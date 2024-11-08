package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MinimumDiffHighLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {9,4,1,7};
      int k = 2;
      System.out.println(minimumDiff(nums,k));
	}

	private static int minimumDiff(int[] nums, int k) {
		// TODO Auto-generated method stub
		if(k == 1) {
			return 0;
		}
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		int i = 0;
		int j = k-1;
		while(j<nums.length) {
			min = Math.min(min,nums[j] - nums[i]);
			i++;
			j++;
		}
		return min;
	}

}
