package com.techymeet.leetCodeProgram;

public class FinalArrayStateAfterKMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,1,3,5,6};
		int k = 5;
		int multiplier = 2;
		int[] ans = getFinalState(nums,k,multiplier);
		System.out.println(ans);
	}

	private static int[] getFinalState(int[] nums, int k, int multiplier) {
		// TODO Auto-generated method stub
		while(k !=0) {
			int[] ans = helper(nums);
			int minNum = ans[0];
			int min  = ans[1];
			minNum *= multiplier;
			nums[min] = minNum;
			k--;
		}
		return nums;
	}

	private static int[] helper(int[] nums) {
		// TODO Auto-generated method stub
		int n = nums.length;
		int minNum = nums[0];
		int min = 0;
		for(int i=1;i<n;i++) {
			if(minNum > nums[i]) {
				minNum = nums[i];
				min = i;
			}
		}
		int[] arr = {minNum,min};
		return arr;
	}

}
