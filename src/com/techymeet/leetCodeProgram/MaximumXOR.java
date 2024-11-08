package com.techymeet.leetCodeProgram;

public class MaximumXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,4,6};
		int res = 0;
		for(int i:nums) {
			res |= i;
		}
		System.out.println(res);
	}

}
