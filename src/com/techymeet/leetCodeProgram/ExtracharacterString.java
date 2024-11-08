package com.techymeet.leetCodeProgram;

import java.util.Scanner;

public class ExtracharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
//		String s  = sc.next();
//		int n = sc.nextInt();
//		String[] word = new String[n];
//		for(int i=0;i<word.length;i++) {
//            word[i] = sc.nextLine();
		String s = "leetscode";
		String[] word = {"leet","code","leetcode"};
	
		
     System.out.println(findString(s,word));

}

	private static int findString(String s, String[] word) {
		// TODO Auto-generated method stub
	/*	StringBuilder sb  = new StringBuilder();
	    for(int i=0;i<s.length();i++) {
	    	char ch = s.charAt(i);
	    	
	    	for(int j=0;j<word.length;i++) {
	    	String str =	word.toString();
	       char c1 = str.charAt(i);
	       if(ch == c1) {
	    	   sb.append(ch);
	       }
	    	}
	    }
	   int num = sb.length();
		*/
		StringBuilder sb = new StringBuilder();
		int num = 0;
	    String str = " ";
	    for(String n : word) {
	    	str+= n;
	    }
		char[] c1 = str.toCharArray();
		char[] c2 = s.toCharArray();
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c2[j] != c1[i]) {
					sb.append(c2[i]);
					num  = sb.length();
				}
			}
		}
		
		return num;
	}}
