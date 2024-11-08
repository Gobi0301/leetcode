package com.techymeet.leetCodeProgram;

public class DivideAnArrayIntoSubarrayMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,2,3,12};
        System.out.println(minimumCost(nums));
	}

	private static int minimumCost(int[] nums) {
		// TODO Auto-generated method stub
		int first = nums[0];
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=1;i<nums.length;i++) {
			if(min1 > nums[i]) {
				min2 = min1;
				min1 = nums[i];
			}else if(min2 > nums[i]) {
				min2 = nums[i];
			}
		}
		return first + min1 + min2;
	}

}
