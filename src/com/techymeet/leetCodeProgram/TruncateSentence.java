package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class TruncateSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		int k = sc.nextInt();
		
		String result = truncateSentence(s,k);
		System.out.println(result);

	}

	private static String truncateSentence(String s, int k) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ')
				count++;
			if(count == k)
				return s.substring(0,i);
			
		}
		String result = s;
		return result;
	}

}
