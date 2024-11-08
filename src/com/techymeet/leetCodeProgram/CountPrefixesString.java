package com.techymeet.leetCodeProgram;

public class CountPrefixesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] words = {"a","b","c","ab","bc","abc"};
       String s = "abc";
       System.out.println(countPrefixes(words,s));
	}

	private static int countPrefixes(String[] words, String s) {
		// TODO Auto-generated method stub
		int count = 0;
		for(String str:words) {
           if(s.startsWith(str)) {
        	   count++;
           }
		}
		return count;
	}

}
