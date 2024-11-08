package com.techymeet.leetCodeProgram;

public class MinimumValueGetPositiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));
	}

	private static int minStartValue(int[] nums) {
		// TODO Auto-generated method stub
		int sum = 0;
		int prefix = Integer.MAX_VALUE;
		for(int i:nums) {
			sum+=i;
			prefix = Math.min(prefix, sum);
		}
		return 1-prefix;
	}

}
