package com.techymeet.leetCodeProgram;

public class FirstLetterAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "abccbaacz";
		System.out.println(findRepeatedCharacter(s));

	}

	private static char findRepeatedCharacter(String s) {
		// TODO Auto-generated method stub
		for(int i=1;i<s.length();i++) {
			if(s.indexOf(s.charAt(i)) != i) {
				return s.charAt(i);
			}
		}
		return ' ';
	}

}
