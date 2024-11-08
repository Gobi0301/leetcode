package com.techymeet.leetCodeProgram;

public class ReverseOnlyletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "ab-cd";
       String ans = reverseOnly(s);
       System.out.println(ans);
	}

	private static String reverseOnly(String s) {
		// TODO Auto-generated method stub
		if(s == null || s.isEmpty()) {
			return "";
		}
		char[] c  = s.toCharArray();
		int left = 0,right = s.length()-1;
		while(left < right) {
			while(left < right && !Character.isLetter(s.charAt(left))) {
				left++;
			}
			while(left<right && !Character.isLetter(s.charAt(right))) {
				right--;
			}
			if(left < right) {
				char temp = c[left];
				c[left] = c[right];
				c[right] =  temp;
 			}
			left++;
			right--;
		}
		return new String(c);
	}

}
