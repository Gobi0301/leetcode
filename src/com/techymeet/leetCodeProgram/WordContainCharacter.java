package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordContainCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	/*	int n = sc.nextInt();
		String[] s = new String[n];
		for(int i=0;i<s.length;i++) {
			s[i] = sc.nextLine();
		}
		char c = sc.next().charAt(1);*/
		String[] s  = {"abc","bcd","aaaa","cbc"};
		char c = 'a';
		System.out.println(findword(s,c));

	}

	private static List<Integer> findword(String[] s,char c) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		//int j = 0;
	     for(int i=0;i<s.length;i++) {
	    	char[] ch = s[i].toCharArray();
	    	for(int j=0;j<ch.length;j++) {
	    		if(ch[j]  == c) {
	    			list.add(i);
	    			break;
	    		}
	    	}
	     }
		
		System.out.println(list);
		
		return null;
	}

}
