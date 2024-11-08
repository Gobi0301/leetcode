package com.techymeet.leetCodeProgram;

public class SpecialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2,1,4};
       System.out.println(isArraySpecial(nums));
	}

	private static boolean isArraySpecial(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length == 1) {
			return true;
		}
		for(int i=0;i<nums.length-1;i++) {
			if((nums[i] & 1) == (nums[i+1] & 1)) {
				return false;
			}
		}
		return true;
	}

}
