package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {1,4,3,2};
      System.out.println(findSum(nums));
	}

	private static int findSum(int[] nums) {
		// TODO Auto-generated method stub
		int sum = 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i+=2) {
			sum += nums[i];
		}
		return sum;
	}

}
