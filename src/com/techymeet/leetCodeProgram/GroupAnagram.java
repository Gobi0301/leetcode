package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"eat","tea","tan","ate","nat","bat"};
	    List<List<String>> res = groupAnagram(str);
	    System.out.println(res);
	}

	private static List<List<String>> groupAnagram(String[] str) {
		// TODO Auto-generated method stub
		Map<String,List<String>> map = new HashMap<>();
		for(String word : str) {
			char[]  c = word.toCharArray();
			Arrays.sort(c);
			String sorted = new String(c);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(word);
		}
		return new ArrayList<>(map.values());
	}

}
