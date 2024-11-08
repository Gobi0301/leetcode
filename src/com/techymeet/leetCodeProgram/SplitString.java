package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	int total =	balancedStringSplit(s);
		System.out.println(total);
	}

	private static int balancedStringSplit(String s) {
		int count ,total;
		count = total=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'R')
				count++;
			else 
				count--;
			if(count == 0)
				total++;
		}
		return total;
		// TODO Auto-generated method stub
		
	
	
		
	}
}
