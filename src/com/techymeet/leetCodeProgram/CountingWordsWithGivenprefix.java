package com.techymeet.leetCodeProgram;

public class CountingWordsWithGivenprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] words = {"leetcode","win","loops","success"};
       String pref = "code";
      int res = prefixCount(words,pref);
      System.out.println(res);
	}

	private static int prefixCount(String[] words, String pref) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<words.length;i++) {
			String s = words[i];
			if(s.startsWith(pref)) {
				count++;
			}
		}
		return count;
	}

}
