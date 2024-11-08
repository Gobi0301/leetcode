package com.techymeet.leetCodeProgram;

public class LongestSubArrayWithMaximumBitwiseAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,3,2,2};
		int ans = longestSubArray(nums);
		System.out.println(ans);
	}

	private static int longestSubArray(int[] nums) {
		// TODO Auto-generated method stub
		int len = 1;
		
		int max = Integer.MIN_VALUE;
		for(int num:nums) {
			max = Math.max(max, num);
		}
		
		int temp_len = 0;
		for(int num:nums) {
			if(num == max) {
				temp_len++;
			}else {
				len = Math.max(len, temp_len);
				temp_len = 0;
			}
		}
		len = Math.max(len, temp_len);
		return len;
	}

}
