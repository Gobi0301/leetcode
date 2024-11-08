package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ShuffleString {

	public static String restoreString(String s , int[] indices) {
		
		
		char[] ch = new char[indices.length];
		for(int i=0;i<indices.length;i++) {
			ch[indices[i]] = s.charAt(i);
		}
		return String.valueOf(ch);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int n = sc.nextInt();
		int[] indices = new int[n];
		for(int i=0;i<indices.length;i++) {
			indices[i] = sc.nextInt();
		}
		
		String s1 = restoreString(s,indices);
		System.out.println(s1);

	}

}
