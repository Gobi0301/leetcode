package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class FindTheLongestSubStringVowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "eleetminicoworoep";
       int ans = findTheLongestSubString(s);
       System.out.println(ans);
	}

	private static int findTheLongestSubString(String s) {
		// TODO Auto-generated method stub
		int[] map = new int[32];
		Arrays.fill(map, -2);
		map[0] = -1;
		
		int maxLen = 0;
		int mask = 0;

		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			switch(c) {
			case 'a':
				mask ^=1;
				break;
			case 'e':
				mask ^=2;
				break;
			case 'i':
				mask ^= 4;
				break;
			case 'o':
				mask ^= 8;
				break;
			case 'u':
				mask ^= 16;
				break;
			}
			int prev = map[mask];
			if(prev == -2) {
				map[mask] = i;
			}else {
				maxLen = Math.max(maxLen,i-prev);
			}
		}
		
		return maxLen;
	}

}
