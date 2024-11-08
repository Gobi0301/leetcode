package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ThreeSumCloset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int res = threeSumCLose(nums,target);
        System.out.println(res);
	}

	private static int threeSumCLose(int[] nums, int target) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		int closet_sum = Integer.MAX_VALUE/2;
		for(int i=0;i<nums.length-2;i++) {
			int left = i+1,right = nums.length-1;
			while(left < right) {
				int currentSum = nums[i]+nums[left]+nums[right];
				if(Math.abs(currentSum - target) < Math.abs(closet_sum-target)) {
					closet_sum = currentSum;
				}
				if(currentSum < target) {
					left++;
				}else if(currentSum > target) {
					right--;
				}else {
					return currentSum;
				}
			}
		}
		return closet_sum;
	}

}
