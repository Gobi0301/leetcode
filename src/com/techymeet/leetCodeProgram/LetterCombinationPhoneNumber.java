package com.techymeet.leetCodeProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "12";
		/*List<String> list = letterCombination(digits);
        System.out.println(list);*/
		pad("","12");
	}

	/*private static Map<Character,String> digitToletter = new HashMap<>();
	private static List<String> resultList = new ArrayList<>();
	
	private static List<String> letterCombination(String digits) {
		// TODO Auto-generated method stub
		if(digits == null || digits.length() == 0) {
			return resultList;
		}
		digitToletter.put('2', "abc");
		digitToletter.put('3', "def");
		digitToletter.put('4', "ghi");
		digitToletter.put('5', "jkl");
		digitToletter.put('6', "mno");
		digitToletter.put('7', "pqrs");
		digitToletter.put('8', "tuv");
		digitToletter.put('9', "wxyz");
		
		generateCombinations(digits,0,new StringBuilder());
		
		return resultList;
	}

	private static void generateCombinations(String digits, int currentIndex, StringBuilder currentCombination) {
		// TODO Auto-generated method stub
		if(currentIndex == digits.length()) {
			resultList.add(currentCombination.toString());
			return;
		}
		char currentDigit  = digits.charAt(currentIndex);
		String letterOption = digitToletter.get(currentDigit);
		
		if(letterOption != null) {
			for(int i=0;i<letterOption.length();i++) {
				char letter = letterOption.charAt(i);
				currentCombination.append(letter);
				generateCombinations(digits,currentIndex+1,currentCombination);
				currentCombination.deleteCharAt(currentCombination.length()-1);
			}
		}
		
		
	}
*/
	
	static void pad(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit = up.charAt(0) - '0';
		for(int i=(digit-1)*3; i<digit*3;i++) {
			char c = (char) ('a'+ i);
			pad(p+c,up.substring(1));
		}
	}
}
