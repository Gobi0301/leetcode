package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverseString(s));

	}

	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		String ans = "";
		String[] str = s.trim().split("\\s+");
		for(int i=str.length-1;i>0;i--) {
			ans+= str[i] + " ";
		}
		return ans + str[0];
	}

}
