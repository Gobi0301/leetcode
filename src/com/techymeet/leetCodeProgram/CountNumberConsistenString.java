package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Scanner;

public class CountNumberConsistenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
		}
        String s = sc.next();*/
		String[] str = {"ad","bd","aaab","baa","badab"};
		 String s  = "ab";
        System.out.print(countConsistent(s,str));
	}

	private static int countConsistent(String s, String[] str) {
		// TODO Auto-generated method stub
		//int count = 0;
		int ans = 0;
		HashSet<Character> set = new HashSet<>();
	     for(int i=0;i<s.length();i++) {
	    	 set.add(s.charAt(i));
	     }
	     for(int i=0;i<str.length;i++) {
	    	 int count = 0;
	    	 for(int j=0;j<str[i].length();j++) {
	    		 System.out.print(str[i].charAt(j));
	    		 if(!set.contains(str[i].charAt(j)))
	    			 count++;
	    	 }
	     
	     if(count == 0) {
	    	 ans++;
	     }
	     }
		return ans;
	}

}
