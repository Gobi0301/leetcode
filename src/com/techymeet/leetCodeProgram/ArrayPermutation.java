package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ArrayPermutation {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int[] nums = new int[6];
	for(int i=0;i<nums.length;i++) {
		nums[i] = sc.nextInt();
	}
	int[] output = new int[nums.length];
	for(int i=0;i<nums.length;i++) {
		output[i] = nums[nums[i]];
		System.out.println(output[i] + " ");
	}
	
	}

}
