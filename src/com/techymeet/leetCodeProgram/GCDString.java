package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class GCDString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(findGcd(str1,str2));
	}

	private static String findGcd(String str1, String str2) {
		// TODO Auto-generated method stub
		if(!(str1+str2).equals(str2+str1)) {
			return "";
		}
		int a = str1.length();
		int b = str2.length();
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return str2.substring(0,a);
	}

}
