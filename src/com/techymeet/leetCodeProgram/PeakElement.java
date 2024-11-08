package com.techymeet.leetCodeProgram;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {1,2,1,3,5,6,4};
      System.out.println(findElement(nums));
	}

	private static int findElement(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
				return i;
			}
		}
		return -1;
	}

}
