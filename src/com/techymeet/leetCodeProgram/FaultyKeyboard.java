package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class FaultyKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    System.out.println(findKeyboard(s));

	}

	private static String findKeyboard(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'i') {
				sb.reverse();
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

}
