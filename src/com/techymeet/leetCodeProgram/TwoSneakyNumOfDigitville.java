package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class TwoSneakyNumOfDigitville {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {7,1,5,4,3,4,6,0,9,5,8,2};
		int[] ans  = getSneakyNumber(nums);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] getSneakyNumber(int[] nums) {
		// TODO Auto-generated method stub
		int ans[] = new int[2];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			max = Math.max(max, nums[i]);
		}
		int[] freq = new int[max+1];
		for(int i=0;i<nums.length;i++) {
			freq[nums[i]]++;
		}
		int count = 0;
		for(int i=0;i<max+1;i++) {
			if(freq[i] >1) {
				ans[count++] = i;
			}
		}
		
		return ans;
	}

}
