package com.techymeet.leetCodeProgram;

public class FirstPalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		String[] s = {"abc","car","ada","racecar","cool"};
	    String  str = findPalindrome(s);
	    
        System.out.println(str);
	}

	private static String findPalindrome(String[] s) {
		// TODO Auto-generated method stub
		String temp = "";
		for(int i=0;i<s.length;i++) {
			temp = find(s[i]);
			if(s[i].equals(temp)) {
				return temp;
				
			}
		}
		return "";
		
	}

	private static String find(String s1) {
		// TODO Auto-generated method stub
		//String temp = "";
		StringBuilder sb = new StringBuilder(s1).reverse();
	 
	  
		return sb.toString();
	}

}
