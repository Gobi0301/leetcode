package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		nxtPermutation(nums);
	}

	private static void nxtPermutation(int[] nums) {
		// TODO Auto-generated method stub
		int ind1 = -1;
		int ind2 = -1;
		
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i] < nums[i+1]) {
				ind1 = i;
				break;
			}
		}
		if(ind1 == -1) {
			reverse(nums,0);
		}
		else {
			for(int i=nums.length-1;i>=0;i--) {
				if(nums[i] > nums[ind1]) {
					ind2 = i;
					break;	
				}
			}
			swap(nums,ind1,ind2);
			reverse(nums,ind1+1);
		}
		System.out.println(Arrays.toString(nums));
	}

	private static void reverse(int[] nums, int start) {
		// TODO Auto-generated method stub
		int i = start;
		int j = nums.length-1;
		while(i<j) {
			swap(nums,i,j);
			i++;
			j--;
		}
	}

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j]  = temp;
	}

}
