package com.techymeet.leetCodeProgram;

public class MinimumlengthStringDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "ca";
       System.out.println(minimumLen(s));
	}

	private static int minimumLen(String s) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = s.length()-1;
		while(start<end && s.charAt(start) == s.charAt(end)) {
			char c = s.charAt(start);
			while(start<s.length() && s.charAt(start) == c) {
				start++;
			}
			while(end >=0 && s.charAt(end) == c) {
				end--;
			}
		}
		return (end < start) ? 0:(end-start+1);
	}

}
