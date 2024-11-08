package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(isSubSequence(s1,s2));

	}

	private static boolean isSubSequence(String s1, String s2) {
		// TODO Auto-generated method stub
		int c = 0,index =-1;
		for(int i=0;i<s1.length();i++) {
			c= 0;
			for(int j=index+1;j<s2.length();j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					index = j;
					c = 1;
					break;
				}
			}
		
		if(c == 0) {
			return false;
		}
		}
		return true;
	}

}
