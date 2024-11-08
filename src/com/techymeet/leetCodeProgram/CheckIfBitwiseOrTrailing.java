package com.techymeet.leetCodeProgram;

public class CheckIfBitwiseOrTrailing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {1,2,3,4,5};
       System.out.println(hasTrailingZero(nums));
	}

	private static boolean hasTrailingZero(int[] nums) {
		// TODO Auto-generated method stub
	     int sum = 0;
	     for(int i:nums) {
	    	 if(i%2 == 0) {
	    		 sum++;
	    	 }
	     }
	     if(sum > 1) {
	    	 return true;
	     }
		return false;
	}

}
