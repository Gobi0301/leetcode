package com.techymeet.leetCodeProgram;

public class ShifftingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int[] shifts = {3,5,9};
		System.out.println(shiftLetter(s,shifts));
	}

	private static String shiftLetter(String s, int[] shifts) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		int totalShift = 0;
		for(int i=s.length()-1;i>=0;i--) {
			totalShift += shifts[i] %26;
			c[i] = (char) ((c[i] - 97 + totalShift) % 26+97);
		}
		return String.valueOf(c);
	}

}
