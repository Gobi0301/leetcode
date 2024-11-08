package com.techymeet.leetCodeProgram;

public class MergeStringAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "ab";
		String word2 = "pqrs";
		System.out.println(mergeAlternate(word1,word2));

	}

	private static String mergeAlternate(String word1, String word2) {
		// TODO Auto-generated method stub
		int i=0;
		StringBuilder sb= new StringBuilder();
		while(i<word1.length() || i<word2.length()) {
			if(i<word1.length()) {
				sb.append(word1.charAt(i));
			}
			if(i<word2.length()) {
				sb.append(word2.charAt(i));
			}
			i++;
		}
		
		
		return sb.toString();
	}

}
