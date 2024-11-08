package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MaximumProductDiffPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDiff(nums));
	}

	private static int maxProductDiff(int[] nums) {
		// TODO Auto-generated method stub
		int max = 0;
		Arrays.sort(nums);
		max = (nums[nums.length-1] * nums[nums.length-2]) - (nums[0] * nums[1]);
		return max;
	}

}
