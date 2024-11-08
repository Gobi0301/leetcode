package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ReplaceAllDigitCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(replaceDigit(str));

	}

	private static String replaceDigit(String str) {
		// TODO Auto-generated method stub
		char[] ch = str.toCharArray();
		for(int i=1;i<ch.length;i+=2) {
			ch[i] += ch[i-1] - '0';
			
		}
		
		return new String(ch);
	}

}
