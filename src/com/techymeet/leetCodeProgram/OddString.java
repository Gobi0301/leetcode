package com.techymeet.leetCodeProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class OddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] words = {"adc","wzy","abc"};
       System.out.println(oddString(words));
	}

	private static String oddString(String[] words) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new LinkedHashMap<>();
		Map<String , String> map1 = new LinkedHashMap<>();
		String s ="",s1="",finals ="";
		for(String str : words) {
			s="";
			for(int i=0;i<str.length()-1;i++) {
				char a = str.charAt(i),b=str.charAt(i+1);
				s+= a - b;
				s+=" ";
			}
			map.put(s, map.getOrDefault(s, 0)+1);
			map1.put(str,s);
		}
		for(Map.Entry<String, Integer> entry1:map.entrySet()) {
			if(entry1.getValue() == 1) {
				s1 = entry1.getKey();
			}
		}
		for(Map.Entry<String, String> entry2:map1.entrySet()) {
			if(entry2.getValue().equals(s1)) {
				finals = entry2.getKey();
			}
		}
		return finals;
	}

}
