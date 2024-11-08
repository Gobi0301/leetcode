package com.techymeet.leetCodeProgram;

public class AntOnBoundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2,3,-5};
       System.out.println(returnToBoundaryCount(nums));
	}

	private static int returnToBoundaryCount(int[] nums) {
		// TODO Auto-generated method stub
		int currPos = 0,count =0;
		for(int val:nums) {
			currPos += val;
			if(currPos == 0) {
				count++;
			}
		}
		return count;
	}

}
