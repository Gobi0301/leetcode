package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1};
       int target = 1;
       System.out.println(Arrays.toString(searchRange(nums,target)));
	}

	private static int[] searchRange(int[] nums, int target) {
		// TODO Auto-generated method stub
		int first = -1,last=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				if(first == -1) {
					first = i;
				}
				last = i;
			}
		}
		return new int[] {first,last};
	}

}
