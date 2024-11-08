package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SumOfSquareofSpecialElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(sumOfSquare(nums));

	}

	private static int sumOfSquare(int[] nums) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			if( nums.length % (i+1) == 0) {
				sum  += nums[i] * nums[i];
			}
		}
		return sum;
	}

}
