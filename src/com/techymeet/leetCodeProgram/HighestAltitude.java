package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(highestAltitude(nums));

	}

	private static int highestAltitude(int[] nums) {
		// TODO Auto-generated method stub
		int[] ans = new int[nums.length+1];
		 ans[0] = 0;
		 int len = 1;
		 int max = 0;
		for(int i=0;i<nums.length;i++) {
			ans[len++] = ans[i]+ nums[i];
		}
		for(int i=0;i<ans.length;i++) {
			max = Math.max(max, ans[i]);
		}
		return max;
	}

}
