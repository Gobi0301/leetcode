package com.techymeet.leetCodeProgram;

public class CircularSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "leetcode exercises sound delightful";
		boolean ans = isCircularSentence(sentence);
		System.out.println(ans);
	}

	private static boolean isCircularSentence(String sentence) {
		// TODO Auto-generated method stub
		if(sentence.charAt(0) != sentence.charAt(sentence.length()-1))
			return false;
		
	   int k = sentence.indexOf(" ");
	   if(k == -1)
		   return true;
		
	   while(k != -1) {
		   if(sentence.charAt(k-1) != sentence.charAt(k+1)) {
			   return false;
		   }
		   
		   k = sentence.indexOf(" ", k+1);
	   }
		return true;
	}

}
