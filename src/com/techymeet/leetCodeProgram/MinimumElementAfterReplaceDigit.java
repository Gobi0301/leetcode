package com.techymeet.leetCodeProgram;

public class MinimumElementAfterReplaceDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {10,12,13,14};
		int ans = minElement(nums);
		System.out.println(ans);
		
	}

	private static int minElement(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length;i++) {
			nums[i] = sumDigit(nums[i]);
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			min = Math.min(min, nums[i]);
		}
		return min;
	}

	private static int sumDigit(int i) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(i>0) {
			int remain = i % 10;
			sum+=remain;
			i/=10;
		}
		return sum;
	}

}
