package com.techymeet.leetCodeProgram;

public class MinimumOperationtoMakeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,1,1};
       System.out.println(minOperation(nums));
	}

	private static int minOperation(int[] nums) {
		// TODO Auto-generated method stub
		
		if(nums.length == 1) {
			return 0;
		}
		
		int count = 0;
		int prev = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(prev == nums[i]) {
				prev++;
				count++;
			}
			else if(prev > nums[i]) {
				prev++;
				count += prev -(nums[i]);
			}else {
				prev = nums[i];
			}
		}
		
		
		return count;
	}

}
