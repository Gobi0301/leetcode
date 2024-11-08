package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class LongestSubstringPalindorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      System.out.println(findLongestPalindrome(s));
	}

	private static String findLongestPalindrome(String s) {
		// TODO Auto-generated method stub
		if(s.length() <= 1) {
			return s;
		}
		String max = s.substring(0,1);
		for(int i=0;i<s.length()-1;i++) {
			String odd = findPalindrome(s,i,i);
			String even = findPalindrome(s,i,i+1);
			
			if(odd.length() > max.length()) {
				max = odd;
			}
			if(even.length() > max.length()) {
				max = even;
			}
		}
		return max;
	}

	private static String findPalindrome(String s, int i, int j) {
		// TODO Auto-generated method stub
		while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return s.substring(i+1,j);
	}

}
