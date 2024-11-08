package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(lastLength(s));

	}

	private static int lastLength(String s) {
		// TODO Auto-generated method stub
		String a = s.trim();
		int length = 0;
		for(int i=a.length()-1;i>=0;i--) {
			if(a.charAt(i) != ' ') {
                     length++;
			}
			else {
				break;
			}
		}
		return length;
	}

}
