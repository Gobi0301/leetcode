package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Running1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		 sum(nums);
		 System.out.println(Arrays.toString(nums));

	}

	private static int[] sum(int[] nums) {
		// TODO Auto-generated method stud
	for(int i=1;i<nums.length;i++) {
		nums[i] = nums[i-1]+nums[i];
	}
		return nums;
	}

}
