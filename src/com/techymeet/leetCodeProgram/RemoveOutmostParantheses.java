package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class RemoveOutmostParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(findOutParantheses(s));

	}

	private static String findOutParantheses(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int opened = 0;
		for(char c:s.toCharArray()) {
			if( ( c == '('  && opened++ > 0) || ( c== ')' && opened-- >1 ) ) {
			sb.append(c);
			}
		}
		return sb.toString();
	}

}
