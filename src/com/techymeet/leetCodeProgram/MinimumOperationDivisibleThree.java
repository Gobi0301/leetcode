package com.techymeet.leetCodeProgram;

public class MinimumOperationDivisibleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {1,2,3,4};
      System.out.println(minimumOperation(nums));
	}

	private static int minimumOperation(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i:nums) {
			if(i %3 != 0) {
				count++;
			}
		}
		
		return count;
	}

}
