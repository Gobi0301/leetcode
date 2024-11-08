package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
	   HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
	   for(int i=s.length()-1;i>=0;i--) {
		if(charCount.containsKey(s.charAt(i))) {
			int count = charCount.get(s.charAt(i));
			charCount.put(s.charAt(i), ++count);
		}
		else {
			charCount.put(s.charAt(i), 1);
		}
	   }
	   System.out.println(charCount);
	   for(Map.Entry<Character,Integer> map :charCount.entrySet()) {
		   System.out.print(map.getKey()+""+map.getValue());
	   }

	}

}
