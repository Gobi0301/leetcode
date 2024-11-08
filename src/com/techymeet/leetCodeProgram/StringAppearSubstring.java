package com.techymeet.leetCodeProgram;

import java.util.HashSet;

public class StringAppearSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pattern = {"a","abc","bc","d"};
		String word = "abc";
		System.out.println(findCount(pattern,word));

	}

	private static int findCount(String[] pattern, String word) {
		// TODO Auto-generated method stub
		int count = 0;
	   HashSet<String> set = new HashSet<>();
	   for(int i=0;i<word.length();i++) {
		   for(int j=i;j<word.length();j++) {
			   set.add(word.substring(i,j+1));
		   }
	   }
	   for(int i=0;i<pattern.length;i++) {
		   if(set.contains(pattern[i])) {
			   count++;
		   }
	   }
		
		return count;
	}

}
