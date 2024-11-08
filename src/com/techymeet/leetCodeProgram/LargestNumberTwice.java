package com.techymeet.leetCodeProgram;

public class LargestNumberTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,2,3,4};
       System.out.println(dominatIndex(nums));
	}

	private static int dominatIndex(int[] nums) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] > max) {
				secondMax = max;
				max = nums[i];
				index = i;
			}else if(nums[i] > secondMax) {
				secondMax = nums[i];
			}
		}
		if(2*secondMax > max) {
			return -1;
		}
		return index;
	}

}
