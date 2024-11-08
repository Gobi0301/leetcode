package com.techymeet.leetCodeProgram;

public class AppendCharactertoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "coaching";
		String t = "coding";
		System.out.println(appendChar(s,t));
	}

	private static int appendChar(String s, String t) {
		// TODO Auto-generated method stub
		int sIndex = 0,tIndex=0;
		int sLength = s.length() , tLength =t.length();
		while(sIndex < sLength && tIndex < tLength) {
			if(s.charAt(sIndex) == t.charAt(tIndex)) {
				tIndex++;
			}
			sIndex++;
		}
		return tLength - tIndex;
	}

}
