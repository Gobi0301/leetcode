package com.techymeet.leetCodeProgram;

public class FindOfEncryptedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {10,21,32};
        System.out.println(sumOfEncrypted(nums));
	}

	private static int sumOfEncrypted(int[] nums) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num:nums) {
			sum +=(encrypt(num));
		}
		return sum;
	}

	private static int encrypt(int num) {
		// TODO Auto-generated method stub
		int digitNum = 0;
		int largestNum = 0;
		int temp = num;
		
		while(temp >0) {
			int digit = temp % 10;
			if(digit > largestNum) {
				largestNum = digit;
			}
			digitNum++;
			temp /= 10;
		}
		int encrypt = 0;
		for(int i=0;i<digitNum;i++) {
			encrypt = encrypt * 10 + largestNum;
		}
		return encrypt;
	}

}
