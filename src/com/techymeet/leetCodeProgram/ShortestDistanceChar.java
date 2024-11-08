package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class ShortestDistanceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "loveleetcode";
       char c = 'e';
       System.out.println(Arrays.toString(findChar(s,c)));
	}

	private static int[] findChar(String s, char c) {
		// TODO Auto-generated method stub
		int	 n = s.length();
		int[] ans = new int[n];
		int position = -n;
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == c) {
				position = i;
			}
			ans[i] = i - position;
		}
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i) == c) {
				position = i;
			}
			ans[i] = Math.min(ans[i], Math.abs(i-position));
		}
		return ans;
	}

}
