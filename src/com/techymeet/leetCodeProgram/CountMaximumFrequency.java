package com.techymeet.leetCodeProgram;

public class CountMaximumFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {1,2,3,4,5};
        System.out.println(maxFrequency(nums));
	}

	private static int maxFrequency(int[] nums) {
		// TODO Auto-generated method stub
		int m = 0;
		for(int i=0;i<nums.length;i++) {
			m = Math.max(m, nums[i]);
		}
		int[] ans = new int[m+1];
		for(int i=0;i<nums.length;i++) {
			ans[nums[i]]++;
		}
		int max = 0;
		int res = 0;
		for(int i=0;i<ans.length;i++) {
			max = Math.max(max,ans[i]);
		}
		for(int i=0;i<ans.length;i++) {
			if(max == ans[i]) {
				res+=max;
			}
		}
		
		return res;
		
	
	}

}
