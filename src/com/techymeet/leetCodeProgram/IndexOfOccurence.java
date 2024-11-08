package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class IndexOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(indexOfOccurence(s1,s2));

	}

	private static int indexOfOccurence(String s1,String s2) {
		// TODO Auto-generated method stub
		if(s1.contains(s2)) {
		return s1.indexOf(s2);
		}
		return -1;
	}

}
