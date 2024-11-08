package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class IncDecString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     System.out.println(incdecstr(s));
	}

	private static char[] incdecstr(String s) {
		// TODO Auto-generated method stub6
		int[] freq = new int[26];
		int len = s.length();
		for(char c:s.toCharArray()) {
			freq[c-'a']++;
		}
		StringBuilder sb = new StringBuilder();
		
		return null;
	}

}
