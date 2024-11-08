package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class Maximum69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findmaxi69(n));
	}

	private static int findmaxi69(int n) {
		// TODO Auto-generated method stub
		String s = Integer.toString(n);
		StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '6') {
				sb.replace(i, i+1, "9");
				break;
			}
		}
		s = sb.toString();
		int res = Integer.parseInt(s);
		return res;
	}

}
