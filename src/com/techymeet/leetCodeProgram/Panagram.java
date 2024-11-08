package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String str = sc.next();
	  System.out.println(isPanagram(str));

	}

	public static boolean isPanagram(String str) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<Character>();
		str.toLowerCase();
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				set.add(c);
			}
		}
		return set.size() == 26;
	}

}
