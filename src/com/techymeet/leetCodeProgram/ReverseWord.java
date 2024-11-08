package com.techymeet.leetCodeProgram;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWord(s));

	}

	private static String reverseWord(String s) {
		// TODO Auto-generated method stub
	String[] word = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String words:word) {
			sb.append(new StringBuilder(words).reverse()).append(" ");
		}
		return sb.toString().trim();
	}

}
