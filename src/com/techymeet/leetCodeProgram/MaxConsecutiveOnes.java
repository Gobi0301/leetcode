package com.techymeet.leetCodeProgram;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,1,0,1,1,1};
       System.out.println(findMaxconsecutive(nums));
	}

	private static int findMaxconsecutive(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		int max = 0;
		for(int i:nums) {
			if(i==1) {
				count++;
			}else {
				count = 0;
			}
		}
		max = Math.max(max, count);
		return max;
	}
	

}
