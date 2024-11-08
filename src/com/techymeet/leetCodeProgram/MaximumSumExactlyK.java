package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class MaximumSumExactlyK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(maxiSum(nums,k));

	}

	private static int maxiSum(int[] nums, int k) {
		// TODO Auto-generated method stub
		int sum = 0;
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			max = Math.max(max,nums[i]);
		}
		while(k>0) {
			sum+=max;
			max = max+1;
			k--;
		}
		return sum;
	}

}
