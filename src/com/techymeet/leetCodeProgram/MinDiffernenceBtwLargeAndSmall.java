package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class MinDiffernenceBtwLargeAndSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {1,5,0,10,14};
      System.out.println(minDifference(nums));
	}

	private static int minDifference(int[] nums) {
		// TODO Auto-generated method stub
		/*int count = 0;
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			if(max != nums[i]) {
				nums[i] = max;
				count++;
			}
			if(count == 3) {
				break;
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			min = Math.min(nums[i], min);
		}
		
		return max - min;*/
		/*if(nums.length <= 4) {
			return 0;
		}
		Arrays.sort(nums);
		int ans = nums[nums.length-1] - nums[0];
		for(int i=0;i<=3;i++) {
			ans = Math.min(ans, nums[nums.length - (3 -i) - 1] - nums[i]);
		}
		return ans;*/
		
		int n = nums.length;
		if(n <= 4 ) {
			return 0;
		}
		Arrays.sort(nums);
		
		int minDiff = Math.min(Math.min(nums[n-1] - nums[3], nums[n-2]-nums[2]), Math.min(nums[n-3]-nums[1], nums[n-4]-nums[0]));
		
		return minDiff;
	}

}
