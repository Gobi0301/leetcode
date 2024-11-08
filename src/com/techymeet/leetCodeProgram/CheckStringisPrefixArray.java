package com.techymeet.leetCodeProgram;

public class CheckStringisPrefixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "iloveleetcode";
        String[] word = {"i","love","leetcode","apples"};
        boolean ans = isPrefixString(s,word);
        System.out.println(ans);
	}

	private static boolean isPrefixString(String s, String[] word) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<word.length;i++) {
			sb.append(word[i]);	
		if(s.equals(sb.toString())) {
			return true;
		}
		}
		return false;
	}

}
