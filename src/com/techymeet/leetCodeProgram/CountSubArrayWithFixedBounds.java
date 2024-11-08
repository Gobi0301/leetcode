package com.techymeet.leetCodeProgram;

public class CountSubArrayWithFixedBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int nums[] = {1,3,5,2,7,5};
	  int minK = 1;
	  int maxK= 5;
	  System.out.println(countSubArray(nums,minK,maxK));
	}

	private static long countSubArray(int[] nums, int minK, int maxK) {
		// TODO Auto-generated method stub
		long res = 0;
		int badIdx = -1;
		int leftIdx = -1;
		int rightIdx = -1;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] < minK || nums[i] > maxK) {
				badIdx = i;
			}
			if(nums[i] == minK) {
				leftIdx = i;
			}
			if(nums[i] == maxK) {
				rightIdx = i;
			}
			res += Math.max(0, Math.min(leftIdx, rightIdx) - badIdx);
		}
		return res;
	}

}
