package com.techymeet.leetCodeProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
      
       System.out.println( RomanNumerals(n));
	}

	public static String RomanNumerals(int n) {
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		map.put("M", 1000);
		map.put("CM", 900);
		map.put("D",500);
		map.put("CD", 400);
		map.put("C", 100);
		map.put("XC", 90);
		map.put("L", 50);
		map.put("XL", 40);
		map.put("X",10);
		map.put("IX", 9);
		map.put("V", 5);
		map.put("IV", 4);
		map.put("I", 1);
		
		String res = "";
     for(Map.Entry<String, Integer> entry: map.entrySet()) {
    	 int match = n/entry.getValue();
    	 res = res + repeat(entry.getKey(),match);
    	 n = n%entry.getValue();
     }
     return res;
	}
	public static String repeat(String s,int n) {
		if(s == null) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(s);
		}
		return sb.toString();
	}

	}

