package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class SortArrayByParity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {4,2,5,7};
       System.out.println(Arrays.toString(sortArray(nums)));
	}

	private static int[] sortArray(int[] nums) {
		// TODO Auto-generated method stub
	    int i=0,j=1,n=nums.length;
	    
	    while(i<n && j<n) {
	    	while(i<n && nums[i] % 2 == 0) {
	    		i+=2;
	    	}
	    	while(j<n && nums[j] % 2 == 1) {
	    		j+=2;
	    	}
	    	if(i<n && j<n) {
	    		swap(nums,i,j);
	    	}
	    }
		
		return nums;
	}

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp = nums[i];
		 nums[i] = nums[j];
		 nums[j] = temp;
		
	}

}
