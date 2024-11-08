package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {3,2,1};
       System.out.println(thirdMax(nums));
	}

	private static int thirdMax(int[] nums) {
		// TODO Auto-generated method stub
	/*	Arrays.sort(nums);
		int c = 0;
		for(int i=nums.length-1;i>0;i--) {
			if(nums[i] != nums[i-1]) {
				c++;
			}
			if(c==2) {
				return nums[i-1];
			}
		}
		return nums[nums.length-1];*/
		
		
		long first = Long.MIN_VALUE;
		long second = Long.MIN_VALUE;
		long third = Long.MIN_VALUE;
		
		for(int num:nums) {
			if(num >first) {
				third = second;
				second = first;
				first = num;
			}else if(num > second && num < first) {
				third = second;
				second = num;
			}else if(num > third && num < second) {
				third = num;
			}
		}
		if(third == Long.MIN_VALUE)
			return (int) first;
		return (int) third;
		
	}

}
