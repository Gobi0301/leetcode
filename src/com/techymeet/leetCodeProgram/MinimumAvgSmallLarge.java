package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MinimumAvgSmallLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7,8,3,4,15,13,4,1};
       System.out.println(minimumAvg(nums));
	}

	private static double minimumAvg(int[] nums) {
		// TODO Auto-generated method stub
	    int left = 0;
	    int right = nums.length-1;
	    double min = Double.MAX_VALUE;
	    Arrays.sort(nums);
	    while(left <= right) {
	    	double avg = nums[left] + nums[right];
	    	avg = avg/2;
	    	min = Math.min(avg, min);
	    	left++;
	    	right--;
	    }
		return min;
	}

}
