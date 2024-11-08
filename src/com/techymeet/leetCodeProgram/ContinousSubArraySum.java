package com.techymeet.leetCodeProgram;

public class ContinousSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {23,2,4,6,7};
      int k = 6;
      System.out.println(checkSubArray(nums,k));
	}

	private static boolean checkSubArray(int[] nums, int k) {
		// TODO Auto-generated method stub
		int n = nums.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int subArraySum = 0;
				for(int l=i;l<j;l++) {
					subArraySum += nums[l];
				}
				if(subArraySum == 0 && k == 0) {
					return true;
				}
				if(k !=0 && subArraySum % k == 0) {
					return true;
				}
			}
		}
		return false;
	}

}
