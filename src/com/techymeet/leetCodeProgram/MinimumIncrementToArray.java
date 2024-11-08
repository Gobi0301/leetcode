package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MinimumIncrementToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncForUnique(nums));
	}

	private static int minIncForUnique(int[] nums) {
		// TODO Auto-generated method stub
		int ans = 0;
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++) {
			if(nums[i] <= nums[i-1]) {
				ans+= nums[i-1] - nums[i] + 1;
				nums[i] = nums[i-1]+1;
			}
		}
		return ans;
	}

}
