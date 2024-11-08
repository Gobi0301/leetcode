package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";
        List<Boolean> ans = camelMatch(queries,pattern);
        System.out.println(ans);
	}

	private static List<Boolean> camelMatch(String[] queries, String pattern) {
		// TODO Auto-generated method stub
		List<Boolean> list = new ArrayList<>();
		for(int i=0;i<queries.length;i++) {
			String word = queries[i];
			boolean seq = isSubsequence(word.toCharArray(),pattern.toCharArray());
			list.add(seq);
		}
		return list;
	}

	private static boolean isSubsequence(char[] s, char[] p) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		while(i<s.length && j<p.length) {
			if(s[i] == p[j]) {
				i++;
				j++;
			}else if(Character.isUpperCase(s[i])) 
				return false;
			
			else
				i++;
		}
		while(i<s.length) {
			if(Character.isUpperCase(s[i]))
				return false;
			i++;
		}
		return j == p.length;
	}

}
