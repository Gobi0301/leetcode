package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ApplyOperationtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,2,2,1,1,0};
       int[] ans = applyOperations(nums);
       System.out.println(Arrays.toString(ans));
	}

	private static int[] applyOperations(int[] nums) {
		// TODO Auto-generated method stub
		int i =0;
		int n = nums.length-1;
		while(i<n) {
			if(nums[i] == nums[i+1]) {
				nums[i] = nums[i] * 2;
				nums[i+1] = 0;
			}
			i++;
		}
		int count = 0;
		for(int j=0;j<nums.length;j++) {
			if(nums[j] != 0) {
				nums[count++] = nums[j];
			}
		}
		while(count < nums.length) {
			nums[count++] = 0;
		}
		return nums;
	}

}
