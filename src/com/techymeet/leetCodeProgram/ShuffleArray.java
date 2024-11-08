package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ShuffleArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		int[] result = shuffle(nums,n);
		for(int i : result) {
			System.out.println(i);
		}
		
	}

	private static int[] shuffle(int[] nums, int n) {
		// TODO Auto-generated method stub
		int[] result  = new int[2*n];
		int j = 0;
		for(int i=0;i<n;i++) {
			result[j] =nums[i];
			j+=2;
		}
		int k=1;
		for(int i=n;i<result.length;i++) {
			result[k] = nums[i];
			k+=2;
		}
		return result;
	}

}
