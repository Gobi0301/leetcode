package com.techymeet.leetCodeProgram;

import java.util.Arrays;

public class DistanceBtSameLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abaccb";
        int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistance(s,distance));
	}

	private static boolean checkDistance(String s, int[] distance) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[26];
		Arrays.fill(arr1, -1);
		int[] arr2 = new int[26];
		Arrays.fill(arr2, -1);
		for(int i=0;i<s.length();i++) {
		if(arr1[s.charAt(i) - 'a'] == -1) {
			arr1[s.charAt(i) -'a'] = i;
		}
		else {
			arr2[s.charAt(i) -'a'] = i;
		}
		}
		
		for(int i=0;i<26;i++) {
			if(arr1[i] != -1 && (arr2[i] - arr1[i]) -1 != distance[i]) {
				return false;
			}
		}
		return true;
	}

}
