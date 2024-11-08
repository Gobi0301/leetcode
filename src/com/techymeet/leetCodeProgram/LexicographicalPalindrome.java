package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class LexicographicalPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(findLexicographyPalindrome(s));
	}

	private static String findLexicographyPalindrome(String s) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<=j) {
			if(c[i] < c[j]) {
				c[j] = c[i];
			}
			else {
				c[i] = c[j];
			}
				i++;
				j--;
		}
		return new String(c);
	}

}
