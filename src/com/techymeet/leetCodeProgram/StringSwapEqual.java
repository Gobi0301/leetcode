package com.techymeet.leetCodeProgram;

import java.util.HashMap;

public class StringSwapEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "bank";
		String s2 = "kanb";
		System.out.println(findStringEqual(s1,s2));

	}

	private static boolean findStringEqual(String s1, String s2) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		for(char c:s1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		for(char c:s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		if(map1.equals(map2)) {
			return true;
		}
		return false;
	}

}
