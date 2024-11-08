package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String[] str = {"flower","flow","flight"};
		System.out.println(longCommonPrefix(str));

	}

	private static String longCommonPrefix(String[] str) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Arrays.sort(str);
		String first = str[0];
		String last  = str[str.length-1];
		int min = Math.min(first.length(),last.length());
		for(int i=0;i<min;i++) {
			if(first.charAt(i) != last.charAt(i)) {
				return sb.toString();
			}
			sb.append(first.charAt(i));
		}
		return sb.toString();
	}

}
