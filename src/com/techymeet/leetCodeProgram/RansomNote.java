package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2  = sc.next();
		System.out.println(ransomNote(s1,s2));

	}

	private static boolean ransomNote(String s1, String s2) {
		// TODO Auto-generated method stub
		
	if(s1.length() > s2.length()) {
		return false;
	}
	int[] alpha = new int[26];
	for(char c:s2.toCharArray()) {
		alpha[c-'a']++;
	}
	for(char c:s1.toCharArray()) {
		if(alpha[c-'a']==0)
			return false;
		alpha[c-'a']--;
	}
	return true;
	}

}
