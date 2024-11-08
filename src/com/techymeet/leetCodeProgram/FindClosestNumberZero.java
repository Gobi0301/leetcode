package com.techymeet.leetCodeProgram;

public class FindClosestNumberZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));
	}

	private static int findClosestNumber(int[] nums) {
		// TODO Auto-generated method stub
        int ans = nums[0],diff = Math.abs(nums[0]);
		for(int i=1;i<nums.length;i++) {
			if(Math.abs(nums[i]) < diff) {
				ans = nums[i];
				diff = Math.abs(nums[i]);
			}
			
			if(diff == Math.abs(nums[i]) && nums[i] > ans) {
				ans = nums[i];
			}
		}
		return ans;
	}

}
