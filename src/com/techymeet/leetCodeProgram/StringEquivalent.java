package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class StringEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  String[] str1 = new String[n];
  String[] str2 = new String[n];
  for(int i=0;i<str1.length;i++) {
	  str1[i] = sc.next();
  }
  for(int i=0;i<str2.length;i++) {
	  str2[i] = sc.next();
  }
  boolean ans = arrayStringEqual(str1,str2);
  System.out.println(ans);
  
	}

	private static boolean arrayStringEqual(String[] str1, String[] str2) {
		// TODO Auto-generated method stub
	String s1 = "";
	String s2 = "";
	for(int i=0;i<str1.length;i++) {
		s1+=str1[i];
	}
	for(int i=0;i<str2.length;i++) {
		s2+=str2[i];
	}
	 return s1.equals(s2);
	}
}
