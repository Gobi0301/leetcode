package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums =  {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
	}

	private static int searchInsert(int[] nums, int target) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				return i;
			}else if(nums[i] > target) {
				return i;
			}
		}
		return nums.length;
	}

}
