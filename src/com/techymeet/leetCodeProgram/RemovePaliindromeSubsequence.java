package com.techymeet.leetCodeProgram;

public class RemovePaliindromeSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abb";
		System.out.println(removePalindrome(s));
	}

	private static int removePalindrome(String s) {
		// TODO Auto-generated method stub
		if(s.equals(new StringBuilder(s).reverse().toString())) {
			return 1;
		}
		return 2;
	}

}
