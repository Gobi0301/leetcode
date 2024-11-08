package com.techymeet.leetCodeProgram;

public class BinarySubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,0,1,0,1};
       int goal = 2;
       System.out.println(binarySum(nums,goal));
	}

	private static int binarySum(int[] nums, int goal) {
		int totalCount = 0;
		int sum = 0;
		int prefixSum[] = new int[nums.length+1];
		prefixSum[0] = 1;
		
		for(int num:nums) {
			sum+=num;
			
			if(sum>=goal) {
				totalCount+= prefixSum[sum-goal];
			}
			prefixSum[sum]++;
		}
		
		return totalCount;
		
		
	}
}
