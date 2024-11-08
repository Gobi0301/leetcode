package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UncommonWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String s1 = "apple apple";
     String s2 = "banana";
     System.out.println(Arrays.toString(uncommonwords(s1,s2)));
	}

	private static String[] uncommonwords(String s1, String s2) {
		// TODO Auto-generated method stub
	   Map<String,Integer> map = new HashMap<>(); 	
	   ArrayList<String> list = new ArrayList<>();
	   String s = s1+" "+s2;
	   for(String i:s.split(" ")) {
		   map.put(i, map.getOrDefault(i, 0)+1);
	   }
	  // System.out.println(map);
	   for(Map.Entry<String, Integer> e:map.entrySet()) {
		   if(e.getValue() == 1)
			   list.add(e.getKey());
	   }
	 //  System.out.println(list);
	   int i=0;
	   String str[] = new String[list.size()];
	   for(String ans:list) {
		   str[i++] = ans;
	   }
		return str;
	}

}
