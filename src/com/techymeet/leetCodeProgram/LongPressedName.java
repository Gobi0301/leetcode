package com.techymeet.leetCodeProgram;

public class LongPressedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  name = "saeed";
		String typed = "ssaaedd";
		System.out.println(isLongPressed(name,typed));

	}

	private static boolean isLongPressed(String name, String typed) {
		// TODO Auto-generated method stub
		int len1 = name.length();
		int len2 = typed.length();
		int i = 0;
		int j = 0;
		char prev = name.charAt(0);
		char  c2 = typed.charAt(0);
		char c1 = prev;
		while(i<len1 && j<len2) {
			c1 = name.charAt(i);
			c2 = typed.charAt(j);
			if(c1 == c2) {
				i++;
				j++;
				prev = c1;
			}
			else if(c2 == prev) {
				j++;
			}
			else {
				return false;
			}
		}
		while(j<len2) {
			c2 = typed.charAt(j);
			if(c1 != c2) {
				return false;
			}
			j++;
		}
		return i==len1 && j==len2;
	}

}
