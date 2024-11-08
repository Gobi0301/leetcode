package com.techymeet.leetCodeProgram;

public class Pattern132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4};
		boolean ans = find132Pattern(nums);
		System.out.println(ans);
	}

	private static boolean find132Pattern(int[] nums) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length;i++) {
			int j = i+1;
			int k = nums.length-1;
			
			while(j<k) {
				if(nums[i] <nums[k] && nums[k] < nums[j] && i<j && j<k) {
					return true;
				}
				j++;
				k--;
			}
		}
		return false;
	}

}
