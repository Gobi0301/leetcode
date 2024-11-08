package com.techymeet.leetCodeProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String paragraph = 	"Bob. hIt, baLl";
        String[] banned = {"bob", "hit"};
        System.out.println(mostCommonWord(paragraph,banned));
	}

	private static String mostCommonWord(String paragraph, String[] banned) {
		// TODO Auto-generated method stub
		paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
		List<String> ban = Arrays.asList(banned);
		String[] str = paragraph.split("\\s+");
		
		Map<String,Integer> map = new HashMap<>();
		for(String s:str) {
			if(!s.equals(" ") || !s.equals(",")) {
			if(map.containsKey(s)) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}else {
				map.put(s, 1);
			}	
			}
		}
		String ans = "";
		int max = 0;
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			int value = entry.getValue();
			String key = entry.getKey();
			
			if(value > max && !ban.contains(key)) {
				max = value;
				ans = key;
			}
		}
		
		return ans;
	}

}
