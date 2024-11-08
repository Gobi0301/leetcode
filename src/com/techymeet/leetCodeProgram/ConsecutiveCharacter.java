package com.techymeet.leetCodeProgram;

public class ConsecutiveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		System.out.println(maxPower(s));

	}

	private static int maxPower(String s) {
		// TODO Auto-generated method stub
		int max = 1;
		int current = 1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1))
				current++;
			else
				current = 1;
			max = Math.max(max, current);
			}
		max = Math.max(max, current);
		return max ;
	}

}
