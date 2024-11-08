package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class CountVowelStringRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] words = {"are","amy","u"};
		int left = 0;
		int right = 2;
		System.out.println(vowelString(words,left,right));
		

	}

	private static int vowelString(String[] words, int left, int right) {
		// TODO Auto-generated method stub
		int count =  0;
		for(int i=left;i<=right;i++) {
			String a = words[i];
			if(a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i' || a.charAt(0) == 'o' || a.charAt(0)=='u') {
				if(a.charAt(a.length()-1) == 'a' || a.charAt(a.length()-1) == 'e' || 
			a.charAt(a.length()-1) == 'i' || a.charAt(a.length()-1) == 'o' || a.charAt(a.length()-1) == 'u' ) {
					count++;
				}
			}
		}
		return count;
	}

}
