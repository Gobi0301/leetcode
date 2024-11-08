package com.techymeet.leetCodeProgram;

public class FindMaximumDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2,9,15,50};
       int[] divisors = {5,3,7,2};
       System.out.println(maxDivScore(nums,divisors));
	}

	private static int maxDivScore(int[] nums, int[] divisors) {
		// TODO Auto-generated method stub
		int count = 0;
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<divisors.length;i++) {
			int val = 0;
			for(int j=0;j<nums.length;j++) {
				if(nums[j] % divisors[i] == 0) {
					val++;
				}
			}
			if(val > count) {
				count = val;
				ans = divisors[i];
			}else if(count == val) {
				ans = Math.min(ans, divisors[i]);
			}
		}
		return ans;
	}

}
