package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class PercentageOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char letter = sc.next().charAt(0);
		System.out.println(LetterString(str,letter));

	}

	private static int LetterString(String str, char letter) {
		// TODO Auto-generated method stub
		int n = str.length();
		int count  = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == letter) {
				count++;
			}
		}
		return (count*100)/n;
	}

}
