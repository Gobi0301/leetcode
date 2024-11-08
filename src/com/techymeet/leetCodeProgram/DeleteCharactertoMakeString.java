package com.techymeet.leetCodeProgram;

public class DeleteCharactertoMakeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leeetcode";
		String ans = makeFancyString(s);
		System.out.println(ans);

	}

	private static String makeFancyString(String s) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
	    for(char c:s.toCharArray()) {
	    	int n = sb.length();
	    	if(n <2 || !(sb.charAt(n-1) == c && sb.charAt(n-2) == c)) {
	    		sb.append(c);
	    	}
	    }
		return sb.toString();
	}

}
