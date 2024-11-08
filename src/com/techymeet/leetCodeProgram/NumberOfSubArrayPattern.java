package com.techymeet.leetCodeProgram;

public class NumberOfSubArrayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,2,3,4,5,6};
        int[] pattern = {1,1};
        int res = countMatchingSubarray(nums,pattern);
        System.out.println(res);
	}

	private static int countMatchingSubarray(int[] nums, int[] pattern) {
		// TODO Auto-generated method stub
		int n = nums.length;
		int m = pattern.length;
		int count = 0;
		for(int i=0;i<=n-m-1;i++) {
			boolean validate = true;
			for(int j=0;j<m;j++) {
				if(pattern[j] == 1 && nums[i+j+1] <= nums[i+j]) {
					validate = false;
					break;
				}else if(pattern[j] == 0 && nums[i+j+1] != nums[i+j]) {
					validate = false;
					break;
				}else if(pattern[j] == -1 && nums[i+j+1] >= nums[i+j]){
					validate = false;
					break;
				}
			}
			if(validate) {
				count++;
			}
		}
		return count;
	}

}
