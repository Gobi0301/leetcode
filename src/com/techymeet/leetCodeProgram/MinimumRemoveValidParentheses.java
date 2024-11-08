package com.techymeet.leetCodeProgram;

import java.util.Stack;

public class MinimumRemoveValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToValid(s));
	}

	private static String minRemoveToValid(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		boolean[] vis = new boolean[n];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<n;i++) {
			if(Character.isLowerCase(s.charAt(i)))
				continue;
			if(s.charAt(i) == '(') {
				st.push(i);
			}else {
				if(!st.isEmpty()) {
					st.pop();
				}
				else {
					vis[i] = true;
				}
			}
		}
		while(!st.isEmpty()) {
			vis[st.pop()] = true;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			if(!vis[i])
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
