package com.techymeet.leetCodeProgram;

public class SubArrayProductK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {10,5,2,6};
		int k = 100;
         System.out.println(numSubarrayProduct(nums,k));
	}

	private static int numSubarrayProduct(int[] nums, int k) {
		// TODO Auto-generated method stub
		int sum = 1,result =0,left=0;
		for(int right = 0;right<nums.length;right++) {
			sum *=nums[right];
			while(sum>=k && left<=right) {
				sum /= nums[left];
				left++;
			}
			result += right - left +1;
		}
		return result;
	}

}
