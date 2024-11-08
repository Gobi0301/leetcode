package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		String str = sc.next();
		System.out.println(palindrome(str));
	}

	private static boolean palindrome(String str) {
		// TODO Auto-generated method stub
		if (str.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = str.length()- 1;
        while(start <= last) {
        	char currFirst = str.charAt(start);
        	char currLast = str.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
	}

}
