package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class LargestOddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		System.out.println(findLargeOdd(num));

	}

	private static String findLargeOdd(String num) {
		// TODO Auto-generated method stub
		String ans = "";
		int len = num.length()-1;
		for(int i=len;i>=0;i--) {
			char c = num.charAt(i);
			if(Character.getNumericValue(c) % 2 != 0) {
				return num.substring(0, i+1);
			}
		}
		return ans;
	}

}
