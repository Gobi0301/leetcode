package com.techymeet.leetCodeProgram;

public class FindIfDigitGameWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,5,5,25};
        boolean ans = caAliceWin(nums);
        System.out.println(ans);
	}

	private static boolean caAliceWin(int[] nums) {
		// TODO Auto-generated method stub
		int singleDigit = 0;
		int doubleDigit = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>= 10) {
				doubleDigit += nums[i];
			}else {
				singleDigit += nums[i];
			}
		}
		
		if(singleDigit == doubleDigit) {
			return false;
		}else {
			return true;
		}
		
	}

}
