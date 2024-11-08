package com.techymeet.leetCodeProgram;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DifferenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(differenceString(s1,s2));

	}

	private static char differenceString(String s1, String s2) {
		// TODO Auto-generated method stub
		/*List<Character> list = new ArrayList<Character>();
		for(int i=0;i<s2.length();i++) {
			list.add(s1.charAt(i));
		}
		for(int i=0;i<s1.length();i++) {
			list.remove(list.indexOf(s1.charAt(i)));
		}
		return list.get(0);*/
		char c = 0;
		for(char cs : s1.toCharArray()) {
			c ^= cs;
		}
		for(char ct : s2.toCharArray()) {
			c ^= ct;
		}
		return c;
	}

}
