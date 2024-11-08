package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class RangeSumSortedSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4};
		int n = 4;
		int left = 1;
		int right = 5;
		int ans = rangeSum(nums,n,left,right);
		System.out.println(ans);
	}

	private static int rangeSum(int[] nums, int n, int left, int right) {
		// TODO Auto-generated method stub
		int[] ans = new int[n *(n+1)/2];
		int k = 0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum += nums[j];
				ans[k++] = sum;
			}
		}
		
		Arrays.sort(ans);
		int res = 0;
		int mod = (int)Math.pow(10, 7);
		for(int i=left-1;i<right;i++) {
			res = (res + ans[i]) % mod; 
		}
		
		return res;
	}

}
