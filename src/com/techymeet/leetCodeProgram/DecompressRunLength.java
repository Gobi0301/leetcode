package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class DecompressRunLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] nums = new int[n];
       for(int i=0;i<nums.length;i++) {
    	   nums[i] = sc.nextInt();
       }
       int[] result = decompressRun(nums);
       System.out.println(Arrays.toString(result));
	}

	private static int[] decompressRun(int[] nums) {
		// TODO Auto-generated method stub
		int len = 0;
		for(int i=0;i<nums.length;i= i+2) {
			len = len+nums[i];
		}
		int[] result = new int[len];
		int ind = 0;
		for(int i=0;i<nums.length;i= i+2) {
			for(int j=0;j<nums[i];j++) {
				result[ind] = nums[i+1];
				ind++;
			}
		}
		return result;
	}

}
