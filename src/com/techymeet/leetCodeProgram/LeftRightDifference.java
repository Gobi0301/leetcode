package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRightDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		// leftRightDifference(nums);
	int ans[] = leftRightDifference(nums);
		System.out.println(Arrays.toString(ans));

	}

	private static int[] leftRightDifference(int[] nums) {
		// TODO Auto-generated method stub
		int[] leftSum = new int[nums.length];
		int[] rightSum = new int[nums.length];
		try {
		for(int i=1;i<nums.length;i++) {
			leftSum[i] = leftSum[i-1] + nums[i-1];
		}
		for(int i=nums.length-2;i>=0;i--) {
			rightSum[i] = rightSum[i+1] + nums[i+1];
		}
		for(int i=0;i<nums.length;i++) {
			nums[i] = Math.abs(leftSum[i] - rightSum[i]);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return nums;
	}

}
