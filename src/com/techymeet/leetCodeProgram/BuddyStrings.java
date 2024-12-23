package com.techymeet.leetCodeProgram;

public class BuddyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "abcaa";
       String goal = "abcbb";
       boolean ans = buddyString(s,goal);
       System.out.println(ans);
	}

	private static boolean buddyString(String s, String goal) {
		// TODO Auto-generated method stub
	  if(s.length() != goal.length()) {
		  return false;
	  }
	  int count  = 0;
	  for(int i=0;i<s.length();i++) {
		  if(s.charAt(i) != goal.charAt(i)) {
			  count++;
		  }
	  }
	  int[] a = new int[26];
	  int[] b = new int[26];
	  
	  for(char c :s.toCharArray()) {
		  a[c-'a']++;
	  }
	  for(char c:goal.toCharArray()) {
		  b[c - 'a']++;
	  }
	  
	  if(count > 2) {
		  return false;
	  }
	  
	  for(int i=0;i<26;i++) {
		  if(a[i] != b[i]) {
			  return false;
		  }
	  }
	  if(count == 2) {
		  return true;
	  }
	  for(int i=0;i<26;i++) {
		  if(a[i]>=2) {
			  return true;
		  }
	  }
	  return false;
	}

}
