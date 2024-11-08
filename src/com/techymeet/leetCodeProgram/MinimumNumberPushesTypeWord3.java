package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.Collections;

public class MinimumNumberPushesTypeWord3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "abcde";
		int ans = minimumPushes(word);
		System.out.println(ans);
	}

	private static int minimumPushes(String word) {
		// TODO Auto-generated method stub
		Integer[] chfreq = new Integer[26];
		Arrays.fill(chfreq, 0);
		
		for(char c:word.toCharArray()) {
			chfreq[c-'a']++;
		}
		
		Arrays.sort(chfreq,Collections.reverseOrder());
		
		int ans = 0;
		int digitused = 0;
		for(int freq:chfreq) {
			ans+=(digitused/8 +1)*freq;
			digitused++;
		}
		
		return ans;
	}

}
