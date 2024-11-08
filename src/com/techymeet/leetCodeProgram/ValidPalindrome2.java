package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ValidPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      System.out.println(validPalindrome(s));
	}

	private static boolean validPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else 
				return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1)	;
		}
		
		return true;
	}

	private static boolean isPalindrome(String s, int i, int j) {
		// TODO Auto-generated method stub
		while(i<=j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else 
				return false;
		}
		return true;
	}

}
