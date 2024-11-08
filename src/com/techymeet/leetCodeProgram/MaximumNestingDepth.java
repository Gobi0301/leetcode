package com.techymeet.leetCodeProgram;

public class MaximumNestingDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
	}

	private static int maxDepth(String s) {
		// TODO Auto-generated method stub
		int max = 0;
		int openBracket  = 0;
		for(char c:s.toCharArray()) {
			if(c == '(') {
				openBracket++;
			}
			else if(c == ')') {
				openBracket--;
			}
			max = Math.max(max, openBracket);
		}
		return max;
	}

}
