package com.techymeet.leetCodeProgram;

import java.util.HashMap;

public class CharacterEqualNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abacbc";
		System.out.println(findCharEqual(s));

	}

	private static boolean findCharEqual(String s) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c:s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			else {
				map.put(c, 1);
			}
		}
	int val = map.get(s.charAt(0));
	for(Character i:map.keySet()) {
		if(map.get(i) != val) {
			return false;
		}
	}
		return true;
	}

}
