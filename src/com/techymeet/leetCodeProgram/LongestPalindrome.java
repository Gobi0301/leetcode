package com.techymeet.leetCodeProgram;

import java.util.HashSet;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccccdd";
		System.out.println(findLongestPalindrome(s));

	}

	private static int findLongestPalindrome(String s) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<>();
		int len = 0;
		for(char c:s.toCharArray()) {
			if(set.contains(c)) {
				len +=2;
				set.remove(c);
			}else {
				set.add(c);
			}
		}
		if(set.size() > 0) {
			return len+1;
		}
		else {
			
		
		return len;
		}
	}

}
