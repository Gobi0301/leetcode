package com.techymeet.leetCodeProgram;

import java.util.HashSet;

public class MorseCodeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin","zen","gig","msg"};
		System.out.println(findAllcodeWord(words));
	}

	private static int findAllcodeWord(String[] words) {
	  HashSet<String> set = new HashSet<>();
	  String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	for(String word:words) {
		StringBuilder sb = new StringBuilder();
		for(char c:word.toCharArray()) {
			sb.append(morse[c-'a']);
		}
		
		set.add(sb.toString());
	}
	  
	  return set.size();
		
		
		
	}

}
