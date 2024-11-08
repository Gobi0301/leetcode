package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ReversePrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "abcdefd";
		char ch = 'd';
		System.out.println(findReverse(word,ch));
	}

	private static String findReverse(String word, char ch) {
		// TODO Auto-generated method stub
	   StringBuilder sb = new StringBuilder();
	   for(int i=0;i<word.length();i++) {
		  sb.append(word.charAt(i));
		 if(word.charAt(i) == ch) {
			 sb.reverse();
		   break;
		 }
	   }
	   int i = sb.length();
	   String ans = word.substring(i, word.length());
	   String res = sb.toString();
	   res = res + ans;
	  // System.out.println(ans);
		//return sb.toString();
	   return res;
	}

}
