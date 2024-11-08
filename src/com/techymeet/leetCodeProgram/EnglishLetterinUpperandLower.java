package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;

public class EnglishLetterinUpperandLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(findGreatestletter(s));

	}

	private static String findGreatestletter(String s) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<Character>();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c = 'z';c>='A';c--) {
			if(set.contains(c) && set.contains((char) ('a'+(c-'A'))))
				return ""+c;
		}
		return null;
	}

}
