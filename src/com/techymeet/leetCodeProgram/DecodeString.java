package com.techymeet.leetCodeProgram;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3[a]2[bc]";
		String ans = decodeString(s);
		System.out.println(ans);
	}

	private static String decodeString(String s) {
		// TODO Auto-generated method stub
		 Stack<Integer> stac = new Stack<>();
	        Stack<StringBuilder> stacSB = new Stack<>();
	        StringBuilder str = new StringBuilder();
	        int n = 0;

	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c)) {
	                n = n * 10 + (c - '0');
	            } else if (c == '[') {
	                stac.push(n);
	                n = 0;
	                stacSB.push(str);
	                str = new StringBuilder();
	            } else if (c == ']') {
	                int k = stac.pop();
	                StringBuilder temp = str;
	                str = stacSB.pop();
	                while (k-- > 0) {
	                    str.append(temp);
	                }
	            } else {
	                str.append(c);
	            }
	        }

	        return str.toString();
	}

}
