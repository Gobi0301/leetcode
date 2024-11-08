package com.techymeet.leetCodeProgram;

import java.util.Stack;

public class MakeStringGreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abBAcC";
        System.out.println(makeGood(s));
	}

	private static String makeGood(String s) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		for(char c:s.toCharArray()) {
			if(!st.isEmpty() && Math.abs(c-st.peek()) == 32) {
				st.pop();
			}
			else {
				st.push(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty()) {
			sb.insert(0, st.pop());
		}
		return sb.toString();
	}

}
