package com.techymeet.leetCodeProgram;

import java.util.HashMap;

public class CountCommonOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words1 = {"leetcode","is","amazing","as","is"};
		String[] words2 = {"amazing","leetcode","is"};
		System.out.println(countWords(words1,words2));

	}

	private static int countWords(String[] words1, String[] words2) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map1 = new HashMap<>();
		HashMap<String,Integer> map2 = new HashMap<>();
		for(String s:words1) {
			map1.put(s, map1.getOrDefault(s, 0)+1);
		}
		for(String s:words2) {
			map2.put(s, map2.getOrDefault(s, 0)+1);
		}
		int count = 0;
		for(String s:words1) {
			if(map1.get(s) == 1 && map2.getOrDefault(s, 0) == 1)
				count++;
		}
		return count;
	}

}
