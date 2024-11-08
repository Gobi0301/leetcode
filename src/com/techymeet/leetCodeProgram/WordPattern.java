package com.techymeet.leetCodeProgram;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String pattern = "abba";
       String s = "dog cat cat dog";
       boolean ans = wordPattern(pattern,s);
       System.out.println(ans);
	}

	private static boolean wordPattern(String pattern, String s) {
		// TODO Auto-generated method stub
		String[] str = s.split(" ");
		if(str.length != pattern.length()) {
			return false;
		}
		HashMap<Character,String> map = new HashMap<>();
		for(int i=0;i<pattern.length();i++) {
			char c = pattern.charAt(i);
			String s1 = str[i];
			if(map.containsKey(c)) {
				if(!map.get(c).equals(s1)) {
					return false;
				}
			}else {
				if(map.containsValue(s1)) {
					return false;
				}
				map.put(c, s1);
			}
		}
		return true;
	}

}
