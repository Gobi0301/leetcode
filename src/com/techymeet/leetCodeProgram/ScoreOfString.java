package com.techymeet.leetCodeProgram;

public class ScoreOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(scoreOfString(s));
	}

	private static int scoreOfString(String s) {
		// TODO Auto-generated method stub
		int ans = 0;
		for(int i=0;i<s.length()-1;i++) {
			ans += Math.abs(s.charAt(i) - s.charAt(i+1));
		}
		return ans;
	}

}
