package com.techymeet.leetCodeProgram;

public class SumOfAllXORSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {5,1,6};
       System.out.println(subsetXor(nums));
	}
   static int total = 0;
	private static int subsetXor(int[] nums) {
		// TODO Auto-generated method stub
		int len = nums.length;
		subset(nums,0,0,len);
		return total;
	}
	private static void subset(int[] nums, int prev, int start, int len) {
		// TODO Auto-generated method stub
		for(int i=start;i<len;i++) {
			int temp = prev ^ nums[i];
			total += temp;
			subset(nums,temp,i+1,len);
		}
	}
	

}
