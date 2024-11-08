package com.techymeet.leetCodeProgram;

public class CountSubarrayMaxK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] nums = {1,3,2,3,3};
    int k =2;
    System.out.println(countSubArray(nums,k));
	}

	private static long countSubArray(int[] nums, int k) {
		// TODO Auto-generated method stub
		long maxNum = Long.MIN_VALUE ,count = 0;
		long left = 0,right =0,ans =0;
		for(int num:nums) {
			maxNum = Math.max(maxNum, num);
		}
		while(right < nums.length || left > right) {
			if(nums[(int)right] == maxNum) {
				count++;
			}
			while(count >= k) {
				if(nums[(int) left] == maxNum) {
					count--;
				}
				left++;
				ans += nums.length - right;
			}
			right++;
		}
		return ans;
	}

}
