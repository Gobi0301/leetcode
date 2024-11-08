package com.techymeet.leetCodeProgram;

public class StringsHalvesAlike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "textbook";
        System.out.println(halvesAreAlike(s));
	}

	private static boolean halvesAreAlike(String s) {
		int len = s.length();
		int mid = len/2;
		String a = s.substring(0,mid);
		String b= s.substring(mid,len);
		//System.out.println(a+b);
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i'|| a.charAt(i) == 'o'|| a.charAt(i) == 'u' || 
			   a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U') {
				count1++;
			}
		}
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i'|| b.charAt(i) == 'o'|| b.charAt(i) == 'u' || 
			b.charAt(i) == 'A' || b.charAt(i) == 'E' || b.charAt(i) == 'I' || b.charAt(i) == 'O' || b.charAt(i) == 'U') {
						count2++;
					}
		}
		if(count1 == count2) {
			return true;
		}
		return false;
		
		
	}

}
