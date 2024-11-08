package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ElementAndDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(differenceSum(nums));

	}

	private static int differenceSum(int[] nums) {
		// TODO Auto-generated method stub
		int element = 0;
		int digit = 0;
		for(int i=0;i<nums.length;i++) {
			element+=nums[i];
		
		int val = nums[i];
		int x;
		while(val > 0) {
			x = val %10;
			digit +=x;
			val = val/10;
		}
		
	}
    return Math.abs(element - digit);
}

}