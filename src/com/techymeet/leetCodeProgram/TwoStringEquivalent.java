package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;

public class TwoStringEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		String word1 = "abcdeef";
		String word2 = "abaaacc";
		System.out.println(findEquivalent(word1,word2));

	}

	private static boolean findEquivalent(String word1, String word2) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map1 = new HashMap<>();
		for(char c : word1.toCharArray()) {
			if(map1.containsKey(c)) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
			}else {
				map1.put(c, 1);
			}
		}
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		for(char c:word2.toCharArray()) {
			if(map2.containsKey(c)) {
				map2.put(c, map2.getOrDefault(c, 0)+1);
			}
			else {
				map2.put(c, 1);
			}
		}
		for(char c:map1.keySet()) {
			if(!map2.containsKey(c))
				map2.put(c, 0);
			if(map1.get(c) - map2.get(c) > 3)
				return false;
		}
	
		for(char c:map2.keySet()) {
			if(!map1.containsKey(c))
				map1.put(c, 0);
			if(map2.get(c) - map1.get(c) > 3)
				return false;
		}
		return true;
	}

}
