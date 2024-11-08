package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
	}

	private static int[] findErrorNums(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		int i = 0;
		while(i<n) {
			int idx = nums[i] - 1;
			if(nums[i] != nums[idx]) {
				swap(i,idx,nums);
			}else {
				i++;
			}
		}
		for(i=0;i<n;i++) {
			if(nums[i] != i+1) {
			return new int[] {nums[i],i+1};	
			}
		}
		return null;
	}

	private static void swap(int i, int j, int[] nums) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}

}
