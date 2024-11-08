package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {100,4,200,1,3,2};
		int ans = longestConsecutive(nums);
		System.out.println(ans);
	}

	private static int longestConsecutive(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		if(nums.length == 0) {
			return 0;
		}
		int max = 1;
		int count = 1;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i] - nums[i-1] == 1) {
				count++;
				max = Math.max(max, count);
			}else if(nums[i] == nums[i-1]) {
				continue;
			}
			else {
				count = 1;
			}
		}
		return max;
	}

}
