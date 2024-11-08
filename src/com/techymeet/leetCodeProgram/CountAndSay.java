package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countSay(n));
	}

	private static String countSay(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return "1";
		String s = countSay(n-1);
		
		int c = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			c++;
			if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)) {
				sb.append(c).append(s.charAt(i));
				c=0;
			}
		}
		
		return sb.toString();
	}

}
