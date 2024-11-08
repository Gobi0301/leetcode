package com.techymeet.leetCodeProgram;

import java.util.HashMap;
import java.util.Scanner;

public class DecodeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String key = sc.nextLine();
  String message = sc.nextLine();
  String str = KeyAndValue(key,message);
  System.out.println(str);
	}

	private static String KeyAndValue(String key, String message) {
		// TODO Auto-generated method stub
		HashMap<Character,Character> map = new HashMap<>();
		char c = 'a';
		for(char ch :key.toCharArray()) {
			if(!map.containsKey(ch) && ch != ' ') {
				map.put(ch, (char)c);
				c +=1;
			}
		}
		String ans = "";
		for(char ch:message.toCharArray()) {
			if(ch != ' ')
				ans += Character.toString(map.get(ch));
			else
				ans+=" ";
		}
		
		return ans;
	}

}
