package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MinimizeMaximumPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {3,5,2,3};
       System.out.println(minPairSum(nums));
	}

	private static int minPairSum(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length/2;i++) {	
				max = Math.max(max, nums[i]+nums[nums.length-i-1]);
			}
		return max;
	}

}
