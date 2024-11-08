package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class LargestPositiveIntegerWithNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,2,-3,3};
		System.out.println(findMax(nums));
	}

	private static int findMax(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		int n = nums.length;
		for(int i=n-1;i>0;i--) {
			if(nums[i] >0 && Arrays.binarySearch(nums,-nums[i])>=0) {
				return nums[i];
			}
		}
		return -1;
	}

}
