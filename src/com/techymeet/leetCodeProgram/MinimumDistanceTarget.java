package com.techymeet.leetCodeProgram;

public class MinimumDistanceTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1;
        int start = 0;
        System.out.println(getMinDistance(nums,target,start));
	}

	private static int getMinDistance(int[] nums, int target, int start) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				min = Math.min(min,Math.abs(i-start));
			}
		}
		return min;
	}

}
