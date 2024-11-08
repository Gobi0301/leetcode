package com.techymeet.leetCodeProgram;

import java.util.HashSet;
import java.util.Set;

public class ExtraCharacterInString {

	public static void main(String[] args) {
		
		String s = "leetscode";
		String[] dictionary = {"leet","code","leetcode"};
		int ans = minExtraChar(s,dictionary);
		System.out.println(ans);
	}

	private static int minExtraChar(String s, String[] dictionary) {
		// TODO Auto-generated method stub
		int n = dictionary.length;
		int[] dp = new int[s.length()+1];
		Set<String> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(dictionary[i]);
		}
		
		for(int i=1;i<=s.length();i++) {
			dp[i] = dp[i-1] +1;
			for(int j=0;j<=i;j++) {
				String sub = s.substring(j,i);
				if(set.contains(sub)) {
					dp[i] = Math.min(dp[i], dp[j]);
				}
			}
		}
		return dp[s.length()];
	}
}
