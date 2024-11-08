package com.techymeet.leetCodeProgram;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abab";
        boolean ans = repeatedSubstringPattern(s);
        System.out.println(ans);
	}

	private static boolean repeatedSubstringPattern(String s) {
		// TODO Auto-generated method stub
		String twice = s + s;
		String sub = twice.substring(1, twice.length()-1);
		return sub.contains(s);
	}

}
