package com.techymeet.leetCodeProgram;

public class MaximumStrongpairXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {10,100};
      System.out.println(maximumPairXoR(nums));
	}

	private static int maximumPairXoR(int[] nums) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
					res = Math.max(res, nums[i] ^ nums[j]);
				}
					
			}
		}
		return res;
	}

}
