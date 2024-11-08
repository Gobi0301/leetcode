package com.techymeet.leetCodeProgram;

import java.util.Stack;

public class ReverseSubstringParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s = "(abcd)";
           System.out.println(reverseParantheses(s));
	}
	
	static int i = 0;

	private static String reverseParantheses(String s) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		return helper(c);
	}

	private static String helper(char[] c) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		while(i<c.length) {
			if(c[i] == ')') {
				i++;
				return sb.reverse().toString();
			}else if(c[i] == '(') {
				i++;
				String st = helper(c);
				sb.append(st);
			}else {
				sb.append(c[i]);
				i++;
			}
			
		}
		return sb.toString();
	}

}
