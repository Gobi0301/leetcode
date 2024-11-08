package com.techymeet.leetCodeProgram;

public class MinimumSortedRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
	}

	private static int findMin(int[] nums) {
		// TODO Auto-generated method stub
	int left = 0;
	int right = nums.length-1;
	
	while(left < right) {
		int mid = (left+right)/2;
		if(nums[mid] > nums[right]) {
			left = mid+1;
		}
		else {
			right = mid;
		}
	}
		return nums[left];
	}

}
