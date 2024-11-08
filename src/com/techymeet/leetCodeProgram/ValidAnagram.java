package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(anagramCheck(s1,s2));

	}

	private static boolean anagramCheck(String s1, String s2) {
		// TODO Auto-generated method stub
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}

}
