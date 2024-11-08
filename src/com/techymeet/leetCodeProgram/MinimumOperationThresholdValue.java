package com.techymeet.leetCodeProgram;

public class MinimumOperationThresholdValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,4,9};
		int k = 9;
		System.out.println(minOperations(nums,k));

	}

	private static int minOperations(int[] nums, int k) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			if(k>nums[i]) {
				count++;
			}
		}
		return count;
	}

}
