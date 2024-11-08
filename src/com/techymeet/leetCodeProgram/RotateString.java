package com.techymeet.leetCodeProgram;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abcde";
        String goal = "abced";
        boolean  ans = rotateString(s,goal);
        System.out.println(ans);
	}

	private static boolean rotateString(String s, String goal) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);
        int i = 0,j=0;
        int n = sb.length();
		while(n!=0) {
			sb.deleteCharAt(i);
			sb.append(s.charAt(j++));
			if(sb.toString().equals(goal)) {
				return true;
			}
			n--;
		}
		return false;
	}

}
