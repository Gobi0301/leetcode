package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {10,2};
       String ans = largestNumber(nums);
       System.out.println(ans);
	}

	private static String largestNumber(int[] nums) {
		// TODO Auto-generated method stub
		String[] s = new String[nums.length];
		for(int i=0;i<nums.length;i++) {
			s[i] = Integer.toString(nums[i]);
		}
		Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length;i++) {
			sb.append(s[i]);
		}
		return sb.toString();
	}

}
