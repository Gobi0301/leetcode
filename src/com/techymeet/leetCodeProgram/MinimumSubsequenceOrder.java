package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {4,3,10,9,8};
        List<Integer> list  = minSubsequence(nums);
        System.out.println(list);
	}

	private static List<Integer> minSubsequence(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		int sum = 0;
		for(int num:nums) {
			sum+=num;
		}
		
		int current_sum = 0;
		
		for(int j=nums.length-1;j>=0;j--) {
			sum -= nums[j];
			current_sum += nums[j];
			list.add(nums[j]);
			
			if(current_sum > sum) {
				return list;
			}
			
		}
		
		return list;
	}

}
