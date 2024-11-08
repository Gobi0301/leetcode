package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FindIndicesWithIndexAndValueDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0};
		int indexDifference = 0;
		int valueDifference = 0;
		int[] ans = findIndices(nums,indexDifference,valueDifference);	
		System.out.println(Arrays.toString(ans));
	}

	private static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length-indexDifference;i++) {
			for(int j=i+indexDifference;j<nums.length;j++) {
				if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference) {
					return new int[]{i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}

}
